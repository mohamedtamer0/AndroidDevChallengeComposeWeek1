package com.example.androiddevchallengecomposeweek1.ui.theme.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallengecomposeweek1.R
import com.example.androiddevchallengecomposeweek1.model.Doggo
import com.example.androiddevchallengecomposeweek1.ui.theme.accentPink2
import com.example.androiddevchallengecomposeweek1.ui.theme.components.DogListItem
import com.example.androiddevchallengecomposeweek1.ui.theme.components.InfoCard
import com.example.androiddevchallengecomposeweek1.ui.theme.pinkText

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DogDetailScreen(navController: NavHostController, index: String = "0") {
    val dog = Doggo.getDoggoList().plus(Doggo.getDoggoList())[index.toInt()]
    Surface(color = accentPink2, modifier = Modifier.fillMaxHeight()) {
        Column {

            Box(modifier = Modifier.padding(32.dp)) {
                DogListItem(dog, navController, 0)
            }
            Text(
                text = "Details",
                style = typography.body2,
                color = pinkText,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 32.dp, end = 32.dp, top = 32.dp)
            )
            Text(
                text = stringResource(id = dog.longDescription),
                style = typography.body1,
                color = pinkText,
                modifier = Modifier.padding(horizontal = 32.dp)
            )

            LazyColumn()
            {
                // Quick info
                item {
                    dog.apply {

                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp, 0.dp, 16.dp, 0.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            InfoCard(title = "Age", value = dog.age.toString().plus(" yrs"))
                            InfoCard(title = "Color", value = color)
                            InfoCard(title = "Weight", value = weight)
                        }
                    }
                }
            }

            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.Button)),
                modifier = Modifier
                    .padding(32.dp)
                    .fillMaxWidth()
            )
            {
                Text("Adopt Now!", modifier = Modifier.padding(8.dp), color = pinkText)
            }
        }
    }
}