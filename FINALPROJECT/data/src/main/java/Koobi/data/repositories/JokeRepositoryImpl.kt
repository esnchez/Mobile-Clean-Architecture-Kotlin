package Koobi.data.repositories

import Koobi.data.api.ApiService
import Koobi.data.entities.JokeResponse
import Koobi.domain.models.JokeModel
import Koobi.domain.repositories.JokeRepository
import retrofit2.Call
import javax.inject.Inject

class JokeRepositoryImpl
@Inject constructor(
    private val service : ApiService
) : JokeRepository {
    override fun fetchRandomJoke(): Call<JokeModel> {
        return service.getRandomJoke()
    }
}