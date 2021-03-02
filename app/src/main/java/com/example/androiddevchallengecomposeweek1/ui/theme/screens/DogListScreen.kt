package com.example.androiddevchallengecomposeweek1.ui.theme.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallengecomposeweek1.model.Doggo
import com.example.androiddevchallengecomposeweek1.ui.theme.accentPink2
import com.example.androiddevchallengecomposeweek1.ui.theme.components.DogListItem
import com.example.androiddevchallengecomposeweek1.ui.theme.components.PageTaps
import com.example.androiddevchallengecomposeweek1.ui.theme.components.TopBar

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DogListScreen(navController: NavHostController) {
    val dogs = Doggo.getDoggoList().plus(Doggo.getDoggoList())
    Surface(color = accentPink2) {
        Column {
            TopBar(onToggle = { /*TODO*/ })
            PageTaps()
            LazyVerticalGrid(
                cells = GridCells.Fixed(1),
                contentPadding = PaddingValues(24.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                itemsIndexed(dogs) { index, dog ->
                    DogListItem(dog, navController, index)
                }
            }
        }
    }
}
