package Koobi.domain.usecases

import Koobi.domain.models.JokeModel
import Koobi.domain.repositories.JokeRepository
import retrofit2.Call
import javax.inject.Inject

class JokeUseCase
@Inject constructor(private val jokeRepository: JokeRepository){
    fun getRandomJoke() : Call<JokeModel> = jokeRepository.fetchRandomJoke()}


//JokeUseCase.getRandomJoke().enqueue .... .
//DESDE EL VIEW MODEL!!!!
// en el view model se cambia el mutable live data despues del enque.
