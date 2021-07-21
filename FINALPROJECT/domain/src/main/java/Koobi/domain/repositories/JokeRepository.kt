package Koobi.domain.repositories

import Koobi.domain.models.JokeModel
import retrofit2.Call

interface JokeRepository {
    fun fetchRandomJoke() : Call<JokeModel>
}