package Koobi.app.Retrofit

import com.google.gson.annotations.SerializedName

data class JokeResponse (
    @SerializedName("value")
    val Joke: String
)