package Koobi.data.entities

import Koobi.domain.models.JokeModel
import com.google.gson.annotations.SerializedName

data class JokeResponse (
    @SerializedName("value")
    val Joke: JokeModel
)