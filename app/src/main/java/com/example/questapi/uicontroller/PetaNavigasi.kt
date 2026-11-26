package com.example.questapi.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questapi.uicontroller.route.DestinasiEntry
import com.example.questapi.uicontroller.route.DestinasiHome
import com.example.questapi.view.EntrySiswaScreen
import com.example.questapi.view.HomeScreen

@Composable
fun DataSiswaApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
){
    HostNavigasi(navController = navController, modifier = modifier)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ){
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) }
            )
        }
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = { navController.navigateUp() }
            )
        }
    }
}