package com.unknown.core_ui.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit
) {
    Button(onClick = onClick, modifier = Modifier.padding(16.dp)) {
        Text(text = text)
    }
}

@Composable
fun CustomTextButton(
    text: String,
    onClick: () -> Unit
) {
    androidx.compose.material3.TextButton(
        onClick = onClick,
        modifier = Modifier
            .background(Color.LightGray)
            .padding(12.dp)
    ) {
        Text(text = text)
    }
}
