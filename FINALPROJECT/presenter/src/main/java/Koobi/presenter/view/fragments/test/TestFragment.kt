package Koobi.presenter.view.fragments.test

import Koobi.presenter.R
import Koobi.presenter.view.base.BaseFragment
import android.os.Bundle
import android.view.View
import android.widget.TextView
import javax.inject.Inject
import androidx.lifecycle.Observer



class TestFragment : BaseFragment() {

    @Inject
    lateinit var viewModel : TestVM

    /*@Inject
    lateinit var retrofit:Retrofit*/
/*
    lateinit var viewModel : HomeVM
*/
    //    EXEMPLE GET ARGUMENTS
//    private val args: HomeFragmentArgs by navArgs()

    override fun layoutRes() = R.layout.test_fragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //fetchJoke(textView)
        testJoke()
        listenVM(view)

    }
    private fun fetchJoke(textView: TextView) {

    }

    private fun testJoke(){
        viewModel.generateJoke()
    }

    private fun listenVM(view: View) {
        val textView = view.findViewById<TextView>(R.id.textChanging)
        viewModel.mJoke.observe(viewLifecycleOwner, Observer { joke ->
            joke?.let {
                textView.text = joke.jokeText
            }
        })
    }
}



