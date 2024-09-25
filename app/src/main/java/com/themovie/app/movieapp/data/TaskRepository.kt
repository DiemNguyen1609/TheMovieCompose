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

import androidx.paging.PagingData
import com.themovie.app.movieapp.data.source.network.DTOMovie
import kotlinx.coroutines.flow.Flow

/**
 * Interface to the data layer.
 */
interface TaskRepository {

    fun getTasksStreamPaging(): Flow<PagingData<DTOMovie>>

    suspend fun refresh() : Boolean

    fun getTaskStream(taskId: String): Flow<DTOMovie?>

    suspend fun getTask(taskId: String, forceUpdate: Boolean = false): DTOMovie?

    suspend fun refreshTask(taskId: String)

    suspend fun updateTask(taskId: String, title: String, description: String)

    suspend fun deleteAllTasks()

    suspend fun deleteTask(taskId: String)
}
