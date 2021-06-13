package com.example.cjseek.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cjseek.R


@Composable
fun Home() {
    Surface(Modifier.fillMaxSize()) {
        HomeContent(Modifier.fillMaxSize())
    }
}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        HomeAppBar(
            MaterialTheme.colors.surface.copy(alpha = 0.8f),
            Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun HomeAppBar(
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.abc_vector_test),
                    contentDescription = null
                )
                Text(
                    text = stringResource(R.string.app_name),
                    color = Color.White,
                    modifier = Modifier
                        .padding(start = 4.dp)
                )
            }
        },
        backgroundColor = backgroundColor,
        actions = {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                IconButton(
                    onClick = {

                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = stringResource(R.string.search)
                    )
                }
            }
        },
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun HomeAppBarPreview() {
    HomeAppBar(Color.Black, Modifier)
}















