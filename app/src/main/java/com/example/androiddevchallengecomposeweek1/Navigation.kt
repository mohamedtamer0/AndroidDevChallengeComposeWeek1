package com.example.androiddevchallengecomposeweek1

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallengecomposeweek1.ui.theme.screens.DogDetailScreen
import com.example.androiddevchallengecomposeweek1.ui.theme.screens.DogListScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "dogList") {
        composable("dogList") {
            DogListScreen(navController)
        }

        composable("dogDetail/{index}") {
            DogDetailScreen(
                navController,
                index = it.arguments?.getString("index")!!
            )
        }
    }

}