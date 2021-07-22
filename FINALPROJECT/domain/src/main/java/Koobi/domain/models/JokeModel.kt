package Koobi.domain.models

import com.google.gson.annotations.SerializedName

data class JokeModel(
    @SerializedName("value")
    val jokeText: String
)