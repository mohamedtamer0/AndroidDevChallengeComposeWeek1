package com.example.androiddevchallengecomposeweek1.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallengecomposeweek1.R
import com.example.androiddevchallengecomposeweek1.ui.theme.accentPink2
import com.example.androiddevchallengecomposeweek1.ui.theme.blueText
import com.example.androiddevchallengecomposeweek1.ui.theme.pinkText


@Composable
fun PageTaps() {
    Surface(color = accentPink2) {
        Tabs()
    }
}

@Composable
private fun Tabs() {
    Row(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.Button)),
            shape = CircleShape) {
            Text(text = "All",
                color = pinkText)
        }
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.Button)),

            shape = CircleShape) {
            Text(text = "Male", color = pinkText)
        }
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.Button)),
            shape = CircleShape) {
            Text(text = "Female", color = pinkText)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun PreviewPageTaps() {
PageTaps()
}
















