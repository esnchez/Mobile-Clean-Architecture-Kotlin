package Koobi.presenter.view.fragments.test

import Koobi.domain.models.JokeModel
import Koobi.domain.usecases.JokeUseCase
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
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

    /*fun generateJoke() {
        jokeUseCase.getRandomJoke().enqueue(object : Callback<JokeModel>
        {
            override fun onFailure(call: Call<JokeModel>?, t: Throwable?) {
                Log.v("retrofit", "call failed")
            }

            override fun onResponse(call: Call<JokeModel>?, response: Response<JokeModel>?) {
                if (response != null) {
                    _mJoke.value = response.body()
                }
            }
        }
        )
    }*/

    fun generateJoke(){
        jokeUseCase.getRandomJoke()
            .observeOn(AndroidSchedulers.mainThread())
    }
}