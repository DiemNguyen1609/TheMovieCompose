/*
 * Copyright 2023 The Android Open Source Project
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

import com.diemn.apiclient.response.MovieItemResponse
import com.themovie.app.movieapp.data.source.local.LocalMovie
import com.themovie.app.movieapp.data.source.network.DTOMovie

/**
 * Data model mapping extension functions. There are three model types:
 *
 * - Task: External model exposed to other layers in the architecture.
 * Obtained using `toExternal`.
 *
 * - NetworkTask: Internal model used to represent a task from the network. Obtained using
 * `toNetwork`.
 *
 * - LocalTask: Internal model used to represent a task stored locally in a database. Obtained
 * using `toLocal`.
 *
 */

// External to Local
fun DTOMovie.toLocal() = LocalMovie(
    id = id,
    title = title,
    poster = poster,
    year = year,
    country = country,
    imdbRating = imdbRating
)

@JvmName("externalToLocal")
fun List<DTOMovie>.toLocal() = map(DTOMovie::toLocal)

// Local to External
fun LocalMovie.toExternal() = DTOMovie(
    id = id,
    title = title,
    poster = poster,
    year = year,
    country = country,
    imdbRating = imdbRating
)

// Note: JvmName is used to provide a unique name for each extension function with the same name.
// Without this, type erasure will cause compiler errors because these methods will have the same
// signature on the JVM.
@JvmName("localToExternal")
fun List<LocalMovie>.toExternal() = map(LocalMovie::toExternal)

// Network to Local
fun MovieItemResponse.toLocal() = LocalMovie(
    id = id ?: "",
    title = title ?: "",
    poster = poster,
    year = year,
    country = country,
    imdbRating = imdbRating
)

@JvmName("networkToLocal")
fun List<MovieItemResponse>.toLocal() = map(MovieItemResponse::toLocal)

// Network to External
fun MovieItemResponse.toExternal() = toLocal().toExternal()

@JvmName("networkToExternal")
fun List<MovieItemResponse>.toExternal() = map(MovieItemResponse::toExternal)
