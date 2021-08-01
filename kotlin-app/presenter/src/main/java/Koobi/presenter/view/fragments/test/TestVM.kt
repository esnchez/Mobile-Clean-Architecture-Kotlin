package Koobi.presenter.view.fragments.test

import Koobi.domain.models.JokeModel
import Koobi.domain.usecases.JokeUseCase
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.kotlin.subscribeBy
import javax.inject.Inject

class TestVM
@Inject constructor(
    private val jokeUseCase: JokeUseCase
) : ViewModel() {

    private val _mJoke = MutableLiveData<JokeModel>()
    val mJoke : LiveData<JokeModel> = _mJoke

    //Retrofit call without RX JAVA
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

    //Accessing response without SUBSCRIBE BY ...
    /*
     fun generateJoke(){
        jokeUseCase.getRandomJoke()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({response -> onResponse(response)}, {t -> onFailure(t)})
    }

    private fun onResponse(response : JokeModel ){
        Log.i("fran" , "yes" + response.jokeText);
    }

    private fun onFailure(t : Throwable){
        Log.i("Fran", "NOPP", t)
    }*/

    //Best function to access the response (it)

    fun generateJoke(){
        jokeUseCase.getRandomJoke()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy (
                onSuccess = { _mJoke.value = it },
                onError = { Log.i("fran", it.message!!)}
            )
    }


}