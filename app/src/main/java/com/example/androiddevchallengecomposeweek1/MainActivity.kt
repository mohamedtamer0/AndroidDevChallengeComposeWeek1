package com.example.androiddevchallengecomposeweek1

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

import androidx.compose.material.Surface

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview

import com.example.androiddevchallengecomposeweek1.ui.theme.MyTheme
import com.example.androiddevchallengecomposeweek1.ui.theme.accentPink2


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme() {
                DoggoAdoptionApp()
            }
        }
    }
}

@Composable
fun DoggoAdoptionApp() {
    Surface(color = accentPink2) {
        NavGraph()
    }


}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        DoggoAdoptionApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        DoggoAdoptionApp()
    }
}
