package com.example.cjseek.ui.category

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CategoryScreen() {

}

@Composable
fun CategoryContent(onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Nav Compose", modifier = Modifier.clickable { onClick() })
    }
}

@Preview
@Composable
fun PreviewCategoryContent(){
    CategoryContent {

    }
}