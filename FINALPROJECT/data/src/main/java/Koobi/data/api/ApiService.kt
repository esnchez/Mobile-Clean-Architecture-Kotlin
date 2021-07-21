package Koobi.data.api

import Koobi.data.entities.JokeResponse
import retrofit2.Call
import retrofit2.http.GET

public interface ApiService {
    @GET("random/")
    fun getRandomJoke() : Call<JokeResponse>
}