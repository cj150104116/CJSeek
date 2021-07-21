package com.example.cjseek.ui.category

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryScreen(onTabClick: () -> Unit) {
    var name by remember { mutableStateOf("") }
    CategoryContent(name = name, onNameChange = {
        name = it
    }, onTabClick)
}

@Composable
fun CategoryContent(name: String, onNameChange: (String) -> Unit, onTabClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Nav Compose",
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(
                    Color.Cyan
                )

                .clickable {
                    onTabClick()
                }
                .padding(10.dp)
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(10.dp)
        )
        OutlinedTextField(
            value = name,
            onValueChange = onNameChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            label = { Text("Name") }
        )
    }
}

@Preview
@Composable
fun PreviewCategoryContent() {
    CategoryContent("test", {

    }) {

    }
}