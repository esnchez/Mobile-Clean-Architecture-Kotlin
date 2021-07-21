package Koobi.presenter.view.fragments

import Koobi.presenter.R
import Koobi.presenter.view.base.BaseFragment
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import javax.inject.Inject


class TestFragment : BaseFragment() {
    @Inject
    lateinit var retrofit:Retrofit
/*
    lateinit var viewModel : HomeVM
*/
    //    EXEMPLE GET ARGUMENTS
//    private val args: HomeFragmentArgs by navArgs()

    override fun layoutRes() = R.layout.test_fragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView = view.findViewById<TextView>(R.id.textChanging)
        fetchJoke(textView)
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



}



