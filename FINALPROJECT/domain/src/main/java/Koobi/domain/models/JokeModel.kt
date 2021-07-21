package Koobi.domain.models

import com.google.gson.annotations.SerializedName

data class JokeModel(
    @SerializedName("id")
    val jokeId: Int,
    @SerializedName("joke")
    val jokeText: String
)