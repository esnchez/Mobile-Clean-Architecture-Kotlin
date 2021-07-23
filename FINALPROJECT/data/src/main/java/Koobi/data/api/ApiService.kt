package Koobi.data.api

import Koobi.data.entities.JokeResponse
import Koobi.domain.models.JokeModel
import retrofit2.Call
import retrofit2.http.GET

public interface ApiService {
    @GET("random/")
    fun getRandomJoke() : Call<JokeModel>
    //Here we need to use the Observable, or the Single...
}