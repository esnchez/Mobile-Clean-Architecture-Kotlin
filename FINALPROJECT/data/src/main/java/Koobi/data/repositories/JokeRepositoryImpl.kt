package Koobi.data.repositories

import Koobi.data.api.ApiService
import Koobi.domain.models.JokeModel
import Koobi.domain.repositories.JokeRepository
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class JokeRepositoryImpl
@Inject constructor(
    private val service : ApiService
) : JokeRepository {
    //Return the JokeModel --> it = JokeModel
    override fun fetchRandomJoke(): Single<JokeModel> {
        return service.getRandomJoke()
            .map { it }
            .subscribeOn(Schedulers.io())
    }
}