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
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class testFragment : Fragment()  {
    private lateinit var retrofit : RetrofitProvider

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.test_fragment, container, false)
        val textView : TextView = view.findViewById(R.id.textChanging)
        fetchJoke(textView)
        return view
    }



    private fun fetchJoke(textView: TextView) {
        retrofit = RetrofitProvider()
        val call = retrofit.getRetrofit().create(ApiService::class.java).getRandomJoke()
        call.enqueue(object : Callback<JokeResponse> {
            override fun onFailure(call: Call<JokeResponse>?, t: Throwable?) {
                Log.v("retrofit", "call failed")

            }

            override fun onResponse(call: Call<JokeResponse>?, response: Response<JokeResponse>?) {
                Log.v("retrofit", "call success --> " + (response!!.body()!!.Joke))
                textView.text = response.body()!!.Joke
            }
        })
    }
}
