package com.themovie.app.movieapp.presentation.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.themovie.app.movieapp.R
import com.themovie.app.movieapp.data.source.network.DTOMovie
import com.themovie.app.movieapp.presentation.base.TasksTopAppBar

@Composable
fun HomeScreen(
    openDrawer: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel(),
    scaffoldState: ScaffoldState = rememberScaffoldState()
) {
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TasksTopAppBar(
                openDrawer = openDrawer
            )
        },
        modifier = modifier.fillMaxSize(),
    ) { paddingValues ->
        val pagingData = viewModel.obsTheMovieData
        val lazyPagingItems: LazyPagingItems<DTOMovie> = pagingData.collectAsLazyPagingItems()

        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            items(lazyPagingItems.itemCount) { index ->
                lazyPagingItems.let {
                    MyListItem(lazyPagingItems[index])
                }
            }

            lazyPagingItems.apply {
                when {
                    loadState.refresh is LoadState.Loading -> {
                        // Show loading spinner while refreshing
                        item { PageLoader(modifier = Modifier.fillParentMaxSize()) }
                    }

                    loadState.refresh is LoadState.Error -> {
                        val error = loadState.refresh as LoadState.Error
                        item {
                            ErrorItem(message = error.error.localizedMessage ?: "Unknown error")
                        }
                    }

                    loadState.append is LoadState.Loading -> {
                        // Show loading spinner at the end of the list
                        item { LoadingNextPageItem(modifier = Modifier)  }
                    }

                    loadState.append is LoadState.Error -> {
                        // Handle append error
                        val e = lazyPagingItems.loadState.append as LoadState.Error
                        item {
                            ErrorItem(message = e.error.localizedMessage ?: "Unknown error")
                        }
                    }
                }
            }
            item { Spacer(modifier = Modifier.padding(4.dp)) }
        }
    }
}

@Composable
fun MyListItem(item: DTOMovie?) {
    item?.let {
        Row {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(item.poster)
                    .crossfade(true)
                    .placeholder(R.drawable.logo_no_fill)
                    .error(R.drawable.logo_no_fill)
                    .build(),
                contentDescription = "",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(40.dp)
                    // Clip image to be shaped as a circle
                    .clip(CircleShape)
            )
            Text(text = item.title)
        }
    }
}

@Composable
fun PageLoader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.loading),
            color = MaterialTheme.colors.primary,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        CircularProgressIndicator(Modifier.padding(top = 10.dp))
    }
}

@Composable
fun LoadingNextPageItem(modifier: Modifier) {
    CircularProgressIndicator(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp)
            .wrapContentWidth(Alignment.CenterHorizontally)
    )
}


@Composable
fun ErrorItem(message: String) {
    Text(text = message)
}