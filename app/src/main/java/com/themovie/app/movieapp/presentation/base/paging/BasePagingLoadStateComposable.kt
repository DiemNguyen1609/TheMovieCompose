package com.themovie.app.movieapp.presentation.base.paging

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState

@Composable
fun BasePagingLoadStateComposable(
    loadState: LoadState,
    modifier: Modifier = Modifier,
    onRetry: () -> Unit
) {
    when (loadState) {
        is LoadState.Loading -> {
            LoadingComposable(modifier = modifier)
        }

        is LoadState.Error -> {
            ErrorComposable(modifier = modifier, error = loadState.error, onRetry = onRetry)
        }

        is LoadState.NotLoading -> {
            if (loadState.endOfPaginationReached) {
                EmptyComposable(modifier = modifier)
            }
        }
    }
}

@Composable
fun LoadingComposable(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator()
    }
}

@Composable
fun ErrorComposable(modifier: Modifier, error: Throwable, onRetry: () -> Unit) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "An error occurred: ${error.localizedMessage}",
                color = Color.Red,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = onRetry) {
                Text("Retry")
            }
        }
    }
}

@Composable
fun EmptyComposable(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "No more data available.",
            textAlign = TextAlign.Center
        )
    }
}