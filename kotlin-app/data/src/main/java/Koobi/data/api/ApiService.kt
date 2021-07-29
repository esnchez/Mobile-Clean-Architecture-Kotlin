package Koobi.data.api

import Koobi.domain.models.JokeModel
import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.http.GET

public interface ApiService {
    @GET("random/")
    fun getRandomJoke() : Single<JokeModel>
}