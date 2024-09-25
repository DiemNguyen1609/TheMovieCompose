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

package com.themovie.app.movieapp.data.source.network

import com.diemn.apiclient.repository.ITheMovieRepository
import com.diemn.apiclient.response.MovieItemResponse
import kotlinx.coroutines.delay
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import javax.inject.Inject

class TaskNetworkDataSource @Inject constructor(
    private val iTheMovieRepository: ITheMovieRepository
) : NetworkDataSource {

    // A mutex is used to ensure that reads and writes are thread-safe.
    private val accessMutex = Mutex()
    private var tasks = listOf(
        DTOMovie(
            id = "PISA",
            title = "Build tower in Pisa",
            poster = ""
        ),
        DTOMovie(
            id = "TACOMA",
            title = "Finish bridge in Tacoma",
            poster = ""
        )
    )

    override suspend fun loadTasks(): List<MovieItemResponse> = accessMutex.withLock {
        val taskResponse = try {
            iTheMovieRepository.getListMovie(page = 1).data
        } catch (e: Exception) {
            println(e)
            emptyList()
        }
        delay(SERVICE_LATENCY_IN_MILLIS)
        return taskResponse ?: emptyList()
    }

    override suspend fun saveTasks(newTasks: List<DTOMovie>) = accessMutex.withLock {
        delay(SERVICE_LATENCY_IN_MILLIS)
        tasks = newTasks
    }
}

private const val SERVICE_LATENCY_IN_MILLIS = 2000L
