package Koobi.app

import Koobi.app.Retrofit.ApiService
import Koobi.app.Retrofit.JokeResponse
import Koobi.app.Retrofit.RetrofitProvider
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

class testFragment : Fragment()  {
    //private lateinit var retrofit : RetrofitProvider

    @Inject
    lateinit var retrofit:Retrofit

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.test_fragment, container, false)
        val textView = view.findViewById<TextView>(R.id.textChanging)
        fetchJoke(textView)
        return view
    }


    private fun fetchJoke(textView: TextView) {
        //retrofit = RetrofitProvider()
        val call = retrofit.create(ApiService::class.java).getRandomJoke()
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

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }
}
