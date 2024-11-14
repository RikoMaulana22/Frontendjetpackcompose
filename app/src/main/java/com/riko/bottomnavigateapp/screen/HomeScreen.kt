package com.riko.bottomnavigateapp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Title
        Text(
            text = "Home",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )

        // LazyColumn (Vertical list of boxes)
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), // Takes up remaining space
            contentPadding = PaddingValues(8.dp) // Padding around the content
        ) {
            items(10) { index ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp) // Set height of each box
                        .padding(8.dp)
                        .background(Color.Gray) // Set background color for box
                )
            }
        }

        // LazyRow (Horizontal list of boxes)
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            items(10) { index ->
                Box(
                    modifier = Modifier
                        .size(100.dp) // Set size of each box (square)
                        .padding(8.dp)
                        .background(Color.Gray) // Set background color for box
                )
            }
        }
    }
}
