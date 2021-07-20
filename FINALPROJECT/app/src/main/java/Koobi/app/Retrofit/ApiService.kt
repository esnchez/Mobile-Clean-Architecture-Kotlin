package Koobi.app.Retrofit

import retrofit2.Call
import retrofit2.http.GET

public interface ApiService {
    @GET("random/")
    fun getRandomJoke() : Call<JokeResponse>
}

