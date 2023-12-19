package com.bangkit.navomobility.ui.screen.track

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun JalanScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "JALAN",
            fontSize = 24.sp, // Ganti dengan ukuran yang diinginkan
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

    }
}

@Composable
@Preview
fun JalanScreenPreview() {
    JalanScreen()
}