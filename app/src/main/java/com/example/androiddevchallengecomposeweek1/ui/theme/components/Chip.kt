package com.example.androiddevchallengecomposeweek1.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androiddevchallengecomposeweek1.ui.theme.accentPink2
import com.example.androiddevchallengecomposeweek1.ui.theme.card
import com.example.androiddevchallengecomposeweek1.ui.theme.pinkText
import com.example.androiddevchallengecomposeweek1.ui.theme.purple500

@Composable
fun Chip(content: String) {
    Text(
        text = content,
        style = typography.caption,
        color = pinkText,
        modifier = Modifier
            .background(color = accentPink2, shape = RoundedCornerShape(6.dp))
            .padding(3.dp)
    )
}
