package com.example.cjseek.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cjseek.R
import com.example.cjseek.ui.category.CategoryContent
import com.example.cjseek.ui.search.SearchAppBar


@Composable
fun Home() {
    Surface(Modifier.fillMaxSize()) {
        HomeContent(Modifier.fillMaxSize())
    }
}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home", modifier = modifier) {
        composable("home") {
            // A surface container using the 'background' color from the theme
            HomeContent(false) {
                navController.navigate("category")
            }
        }
        composable("category") {
            CategoryContent {
                navController.popBackStack()
            }
        }
    }
}

@Composable
fun SearchContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        SearchAppBar(
            MaterialTheme.colors.surface.copy(alpha = 0.8f),
            Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun HomeScreen() {

    var expanded by remember { mutableStateOf(false) }

    HomeContent(expanded) {
        expanded = !expanded
    }
}

@Composable
fun HomeContent(expanded: Boolean, onClick: () -> Unit) {
    Column {
        Text(
            text = "HELLO WORLD\n" +
                    "HELLO WORLD\n" +
                    "HELLO WORLD\n" +
                    "HELLO WORLD\n" +
                    "HELLO WORLD\n" +
                    "HELLO WORLD",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.h5,
            maxLines = if (expanded) Int.MAX_VALUE else 2,
            overflow = TextOverflow.Ellipsis
        )
        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = null,
            modifier = Modifier
                .clickable {
                    onClick()
                }
                .padding(10.dp)
                .fillMaxWidth()
                .height(180.dp)
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}

















