package Koobi.domain.repositories

import Koobi.domain.models.JokeModel
import io.reactivex.rxjava3.core.Single
import retrofit2.Call

interface JokeRepository {
    fun fetchRandomJoke() : Single<JokeModel>
}