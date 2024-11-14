package com.riko.bottomnavigateapp.screen



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight



import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.riko.bottomnavigateapp.R
@Composable
fun ProfileScreen(navController: NavController) {


    val photos = listOf(
        R.drawable.plant1,
        R.drawable.plant2,
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
        R.drawable.plant2,// Add as many as you need
    )
    PhotoGridScreen(photoList = photos) { clickedPhoto ->
        navController.navigate("photo_detail/${clickedPhoto}")
    }
}