package Koobi.app

import Koobi.app.Retrofit.ApiService
import Koobi.app.Retrofit.JokeResponse
import Koobi.app.Retrofit.RetrofitProvider
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import retrofit2.*

class testFragment : Fragment() {

    private lateinit var retrofitProvider : RetrofitProvider
    private lateinit var joke:String


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.test_fragment, container, false)
        setJoke(view)
        return view

    }

    fun setJoke(view: View){
        val textView = view.findViewById<TextView>(R.id.textChanging)
        textView.text = fetchJoke()
    }


    fun fetchJoke() : String {

        retrofitProvider = RetrofitProvider()
        var joke = "Hello"
        val call = retrofitProvider.getRetrofit().create(ApiService::class.java).getRandomJoke()
        call.enqueue(object : Callback<JokeResponse> {
            override fun onFailure(call: Call<JokeResponse>?, t: Throwable?) {
                Log.v("retrofit", "call failed")
            }

            override fun onResponse(call: Call<JokeResponse>?, response: Response<JokeResponse>?) {
                if (response != null) {
                    if (response.isSuccessful) {
                        joke = response.body()?.Joke.toString()
                        Log.v("retrofit", "call success ${response.body()?.Joke}")
                        Log.v("retrofit", "joke is : $joke")

                        //val textview = view.findViewById<TextView>(R.id.textChanging)
                        //textview.text = response.body()?.Joke
                    }
                }
            }
        })
        return joke
    }


}