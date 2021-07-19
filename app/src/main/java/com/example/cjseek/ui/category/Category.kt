package com.example.cjseek.ui.category

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryScreen() {

}

@Composable
fun CategoryContent(onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Nav Compose",
            modifier = Modifier
                .clip(shape = RoundedCornerShape(10.dp))
                .background(
                    Color.Cyan
                )
                .padding(10.dp)
                .clickable {
                    onClick()
                }
                .align(Alignment.Center)
        )
    }
}

@Preview
@Composable
fun PreviewCategoryContent() {
    CategoryContent {

    }
}