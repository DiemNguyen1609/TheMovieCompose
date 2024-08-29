package com.themovie.app.movieapp.presentation.base.paging

import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import androidx.paging.PagingState

abstract class BasePagingSource<Value : Any>(
    private val pageSize: Int
) : PagingSource<Int, Value>() {

    abstract suspend fun loadData(params: LoadParams<Int>): List<Value>?

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Value> {
        return try {
            loadData(params = params)

            val page = params.key ?: getFirstPage()
            val data = loadData(params = params) ?: listOf()

            val nextKey = if (data.isEmpty()) {
                null
            } else {
                // initial load size = 3 * NETWORK_PAGE_SIZE
                // ensure we're not requesting duplicating items, at the 2nd request
                page + (params.loadSize / pageSize)
            }

            LoadResult.Page(
                data = data,
                prevKey = if (page == getFirstPage()) null else page - 1,
                nextKey = nextKey
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Value>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: getFirstPage()
        }
    }

    open fun getFirstPage(): Int = DEFAULT_FIRST_PAGE

    companion object {
        const val DEFAULT_FIRST_PAGE = 1

        fun getDefaultPageConfig(pageSize: Int): PagingConfig {
            return PagingConfig(pageSize = pageSize, enablePlaceholders = false)
        }
    }
}