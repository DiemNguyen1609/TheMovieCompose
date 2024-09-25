/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.themovie.app.movieapp.data

import androidx.paging.Pager
import androidx.paging.PagingData
import androidx.paging.map
import com.themovie.app.movieapp.data.source.local.TheMovieDao
import com.themovie.app.movieapp.data.source.network.DTOMovie
import com.themovie.app.movieapp.data.source.network.NetworkDataSource
import com.themovie.app.movieapp.di.ApplicationScope
import com.themovie.app.movieapp.di.DefaultDispatcher
import com.themovie.app.movieapp.presentation.base.paging.BasePagingSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Default implementation of [TaskRepository]. Single entry point for managing tasks' data.
 *
 * @param networkDataSource - The network data source
 * @param localDataSource - The local data source
 * @param dispatcher - The dispatcher to be used for long running or complex operations, such as ID
 * generation or mapping many models.
 * @param scope - The coroutine scope used for deferred jobs where the result isn't important, such
 * as sending data to the network.
 */
@Singleton
class DefaultTaskRepository @Inject constructor(
    private val networkDataSource: NetworkDataSource,
    private val localDataSource: TheMovieDao,
    @DefaultDispatcher private val dispatcher: CoroutineDispatcher,
    @ApplicationScope private val scope: CoroutineScope,
) : TaskRepository {

    override suspend fun updateTask(taskId: String, title: String, description: String) {
        val task = getTask(taskId)?.copy(
            title = title
        ) ?: throw Exception("Task (id $taskId) not found")

        localDataSource.upsert(task.toLocal())
       // saveTasksToNetwork()
    }

    override fun getTasksStreamPaging(): Flow<PagingData<DTOMovie>> {
        return Pager(
            config = BasePagingSource.getDefaultPageConfig(pageSize = 10),
        ) {
            localDataSource.observeAllPaging()
        }.flow.map { pagingData ->
            pagingData.map { tasks ->
                withContext(dispatcher) {
                    tasks.toExternal()
                }
            }
        }
    }

    override suspend fun refreshTask(taskId: String) {
        refresh()
    }

    override fun getTaskStream(taskId: String): Flow<DTOMovie?> {
        return localDataSource.observeById(taskId).map { it.toExternal() }
    }

    /**
     * Get a Task with the given ID. Will return null if the task cannot be found.
     *
     * @param taskId - The ID of the task
     * @param forceUpdate - true if the task should be updated from the network data source first.
     */
    override suspend fun getTask(taskId: String, forceUpdate: Boolean): DTOMovie? {
        if (forceUpdate) {
            refresh()
        }
        return localDataSource.getById(taskId)?.toExternal()
    }

    override suspend fun deleteAllTasks() {
        localDataSource.deleteAll()
       // saveTasksToNetwork()
    }

    override suspend fun deleteTask(taskId: String) {
        localDataSource.deleteById(taskId)
       // saveTasksToNetwork()
    }

    /**
     * The following methods load tasks from (refresh), and save tasks to, the network.
     *
     * Real apps may want to do a proper sync, rather than the "one-way sync everything" approach
     * below. See https://developer.android.com/topic/architecture/data-layer/offline-first
     * for more efficient and robust synchronisation strategies.
     *
     * Note that the refresh operation is a suspend function (forces callers to wait) and the save
     * operation is not. It returns immediately so callers don't have to wait.
     */

    /**
     * Delete everything in the local data source and replace it with everything from the network
     * data source.
     *
     * `withContext` is used here in case the bulk `toLocal` mapping operation is complex.
     */
    override suspend fun refresh(): Boolean {
        return withContext(dispatcher) {
            try {
                val remoteTasks = networkDataSource.loadTasks()
                localDataSource.deleteAll()
                localDataSource.upsertAll(remoteTasks.toLocal())
                true
            } catch (e: Exception) {
                false
            }
        }
    }
}
