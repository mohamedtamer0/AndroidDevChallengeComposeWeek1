package com.example.androiddevchallengecomposeweek1.model

import com.example.androiddevchallengecomposeweek1.R

data class Doggo(
    val name: String,
    val photo: Int,
    val color : String,
    val age: String,
    val weight: String,
    val gender: String,
    val shortDescription: String,
    val longDescription: Int = R.string.lorem,
) {
    companion object {
        fun getDoggoList(): ArrayList<Doggo> {
            return arrayListOf(
                Doggo(
                    "Sheroo",
                    R.drawable.dog1,
                    "Brown",
                    "1.4Yrs",
                    "14Kg",
                    "Male",
                    "Like treats",
                ),
                Doggo(
                    "Baadal",
                    R.drawable.dog2,
                    "Brown",
                    "1.4Yrs",
                    "14Kg",
                    "Male",
                    "Looks like Cloud"
                ),
                Doggo(
                    "Hugsy",
                    R.drawable.dog3,
                    "Brown",
                    "1.4Yrs",
                    "14Kg",
                    "Female",
                    "Addictive to hugs"
                ),
                Doggo(
                    "Shishimanu",
                    R.drawable.dog4,
                    "Brown",
                    "1.4Yrs",
                    "14Kg",
                    "Male",
                    "Whines like a baby"
                ),
            )
        }
    }
}
