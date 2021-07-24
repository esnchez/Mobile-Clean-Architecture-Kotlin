package Koobi.presenter.view.fragments.test

import Koobi.domain.models.JokeModel
import Koobi.domain.usecases.JokeUseCase
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class TestVM
@Inject constructor(
    private val jokeUseCase: JokeUseCase
) : ViewModel() {

    private val _mJoke = MutableLiveData<JokeModel>()
    val mJoke : LiveData<JokeModel> = _mJoke

    fun generateJoke() {
        jokeUseCase.getRandomJoke().enqueue(object : Callback<JokeModel>
        {
            override fun onFailure(call: Call<JokeModel>?, t: Throwable?) {
                Log.v("retrofit", "call failed")
            }

            override fun onResponse(call: Call<JokeModel>?, response: Response<JokeModel>?) {
<<<<<<< HEAD
                Log.i("Retrofit", "is working!" + response!!.body())

=======
                if (response != null) {
                    _mJoke.value = response.body()
                }
>>>>>>> 5cf0c6bae1bf27cf1de7a541fe99a854a7d322ff
            }
        }
        )
    }
}