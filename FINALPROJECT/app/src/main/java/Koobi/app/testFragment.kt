package Koobi.app

import Koobi.app.Retrofit.JokeResponse
import Koobi.app.Retrofit.RetrofitProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class testFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.test_fragment, container, false)

    }


    fun fetchJoke() : String {
        var call = RetrofitProvider
    }


}