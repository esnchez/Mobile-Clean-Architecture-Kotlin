package Koobi.domain.usecases

import Koobi.domain.models.JokeModel
import Koobi.domain.repositories.JokeRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class JokeUseCase
@Inject constructor(private val jokeRepository: JokeRepository){
    fun getRandomJoke() : Single<JokeModel> = jokeRepository.fetchRandomJoke()}

