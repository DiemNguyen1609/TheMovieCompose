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

package com.themovie.app.movieapp.data.source.local

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@SmallTest
class TaskDaoTest {

    // using an in-memory database because the information stored here disappears when the
    // process is killed
    private lateinit var database: TheMovieDatabase

    // Ensure that we use a new database for each test.
    @Before
    fun initDb() {
        database = Room.inMemoryDatabaseBuilder(
            getApplicationContext(),
            TheMovieDatabase::class.java
        ).allowMainThreadQueries().build()
    }
    @Test
    fun insertTaskAndGetById() = runTest {
        // GIVEN - insert a task
        val task = LocalMovie(
            title = "title",
            description = "description",
            id = "id",
            isCompleted = false,
        )
        database.theMovieDao().upsert(task)

        // WHEN - Get the task by id from the database
        val loaded = database.theMovieDao().getById(task.id)

        // THEN - The loaded data contains the expected values
        assertNotNull(loaded as LocalMovie)
        assertEquals(task.id, loaded.id)
        assertEquals(task.title, loaded.title)
        assertEquals(task.description, loaded.description)
        assertEquals(task.isCompleted, loaded.isCompleted)
    }

    @Test
    fun insertTaskReplacesOnConflict() = runTest {
        // Given that a task is inserted
        val task = LocalMovie(
            title = "title",
            description = "description",
            id = "id",
            isCompleted = false,
        )
        database.theMovieDao().upsert(task)

        // When a task with the same id is inserted
        val newTask = LocalMovie(
            title = "title2",
            description = "description2",
            isCompleted = true,
            id = task.id
        )
        database.theMovieDao().upsert(newTask)

        // THEN - The loaded data contains the expected values
        val loaded = database.theMovieDao().getById(task.id)
        assertEquals(task.id, loaded?.id)
        assertEquals("title2", loaded?.title)
        assertEquals("description2", loaded?.description)
        assertEquals(true, loaded?.isCompleted)
    }

    @Test
    fun insertTaskAndGetTasks() = runTest {
        // GIVEN - insert a task
        val task = LocalMovie(
            title = "title",
            description = "description",
            id = "id",
            isCompleted = false,
        )
        database.theMovieDao().upsert(task)

        // WHEN - Get tasks from the database
        val tasks = database.theMovieDao().getAll()

        // THEN - There is only 1 task in the database, and contains the expected values
        assertEquals(1, tasks.size)
        assertEquals(tasks[0].id, task.id)
        assertEquals(tasks[0].title, task.title)
        assertEquals(tasks[0].description, task.description)
        assertEquals(tasks[0].isCompleted, task.isCompleted)
    }

    @Test
    fun updateTaskAndGetById() = runTest {
        // When inserting a task
        val originalTask = LocalMovie(
            title = "title",
            description = "description",
            id = "id",
            isCompleted = false,
        )

        database.theMovieDao().upsert(originalTask)

        // When the task is updated
        val updatedTask = LocalMovie(
            title = "new title",
            description = "new description",
            isCompleted = true,
            id = originalTask.id
        )
        database.theMovieDao().upsert(updatedTask)

        // THEN - The loaded data contains the expected values
        val loaded = database.theMovieDao().getById(originalTask.id)
        assertEquals(originalTask.id, loaded?.id)
        assertEquals("new title", loaded?.title)
        assertEquals("new description", loaded?.description)
        assertEquals(true, loaded?.isCompleted)
    }

    @Test
    fun updateCompletedAndGetById() = runTest {
        // When inserting a task
        val task = LocalMovie(
            title = "title",
            description = "description",
            id = "id",
            isCompleted = true
        )
        database.theMovieDao().upsert(task)

        // When the task is updated
        database.theMovieDao().updateCompleted(task.id, false)

        // THEN - The loaded data contains the expected values
        val loaded = database.theMovieDao().getById(task.id)
        assertEquals(task.id, loaded?.id)
        assertEquals(task.title, loaded?.title)
        assertEquals(task.description, loaded?.description)
        assertEquals(false, loaded?.isCompleted)
    }

    @Test
    fun deleteTaskByIdAndGettingTasks() = runTest {
        // Given a task inserted
        val task = LocalMovie(
            title = "title",
            description = "description",
            id = "id",
            isCompleted = false,
        )
        database.theMovieDao().upsert(task)

        // When deleting a task by id
        database.theMovieDao().deleteById(task.id)

        // THEN - The list is empty
        val tasks = database.theMovieDao().getAll()
        assertEquals(true, tasks.isEmpty())
    }

    @Test
    fun deleteTasksAndGettingTasks() = runTest {
        // Given a task inserted
        database.theMovieDao().upsert(
            LocalMovie(
                title = "title",
                description = "description",
                id = "id",
                isCompleted = false,
            )
        )

        // When deleting all tasks
        database.theMovieDao().deleteAll()

        // THEN - The list is empty
        val tasks = database.theMovieDao().getAll()
        assertEquals(true, tasks.isEmpty())
    }

    @Test
    fun deleteCompletedTasksAndGettingTasks() = runTest {
        // Given a completed task inserted
        database.theMovieDao().upsert(
            LocalMovie(title = "completed", description = "task", id = "id", isCompleted = true)
        )

        // When deleting completed tasks
        database.theMovieDao().deleteCompleted()

        // THEN - The list is empty
        val tasks = database.theMovieDao().getAll()
        assertEquals(true, tasks.isEmpty())
    }
}
