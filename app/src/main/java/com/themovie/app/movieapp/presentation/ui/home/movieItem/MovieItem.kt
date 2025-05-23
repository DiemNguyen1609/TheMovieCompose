package com.themovie.app.movieapp.presentation.ui.home.movieItem

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.StarHalf
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.themovie.app.movieapp.R
import com.themovie.app.movieapp.data.source.network.DTOMovie

@Composable
fun MovieItem(item: DTOMovie?) {
    item?.let {
        Row(
            modifier = Modifier
                .padding(dimensionResource(R.dimen._8dp))
                .border(
                    border = BorderStroke(
                        dimensionResource(R.dimen._1dp),
                        colorResource(R.color.neutral_90)
                    ),
                    shape = RoundedCornerShape(dimensionResource(R.dimen._4dp))
                )
                .fillMaxWidth()
                .clickable {
//                    Toast
//                        .makeText(LocalContext.current, item.title, Toast.LENGTH_SHORT)
//                        .show()
                },
            verticalAlignment = Alignment.CenterVertically,
        ) {
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
                    .size(dimensionResource(R.dimen._40dp))
                    // Clip image to be shaped as a circle
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.padding(dimensionResource(R.dimen._2dp)))
            Column(
                modifier = Modifier.padding(
                    horizontal = dimensionResource(R.dimen._4dp),
                    vertical = dimensionResource(R.dimen._2dp)
                )
            ) {
                Text(
                    text = item.title,
                    fontSize = 12.sp,
                    letterSpacing = 1.sp
                )
                Text(
                    text = item.countries?.joinToString(", ") ?: "",
                    fontSize = 10.sp,
                    letterSpacing = 1.sp
                )
                Row {
                    Text(
                        text = item.imdb?.rating ?: "",
                        fontSize = 10.sp,
                        letterSpacing = 1.sp
                    )
                    Spacer(modifier = Modifier.padding(dimensionResource(R.dimen._2dp)))
                }
                StarRatingBar(
                    maxStars = 5,
                    rating = item.imdb?.rating?.toFloatOrNull() ?: 0f,
                    onRatingChanged = {

                    }
                )
            }
        }
    }
}

@Composable
fun StarRatingBar(
    maxStars: Int = 5,
    rating: Float, // 0f to 10f
    onRatingChanged: (Float) -> Unit
) {
    val normalizedRating = rating / 2f // Convert 0–10 to 0–5 scale
    val density = LocalDensity.current.density
    val starSize = (12f * density).dp
    val starSpacing = (0.5f * density).dp

    Row(
        modifier = Modifier.selectableGroup(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 1..maxStars) {
            val icon = when {
                i <= normalizedRating -> Icons.Filled.Star
                i - 0.5f <= normalizedRating -> Icons.AutoMirrored.Filled.StarHalf
                else -> Icons.Default.Star
            }

            val iconTintColor = when {
                i <= normalizedRating || i - 0.5f <= normalizedRating -> Color(0xFFFFC700)
                else -> Color(0x20FFFFFF)
            }

            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = iconTintColor,
                modifier = Modifier
                    .selectable(
                        selected = i <= normalizedRating,
                        onClick = {
                            onRatingChanged(i * 2f) // Convert back to 0–10 scale
                        }
                    )
                    .width(starSize)
                    .height(starSize)
            )

            if (i < maxStars) {
                Spacer(modifier = Modifier.width(starSpacing))
            }
        }
    }
}
