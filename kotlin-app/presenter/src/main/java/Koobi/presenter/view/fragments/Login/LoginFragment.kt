package Koobi.presenter.view.fragments.Login

import Koobi.presenter.R
import Koobi.presenter.view.base.BaseFragment
import Koobi.presenter.view.fragments.test.TestVM
import android.os.Bundle
import android.util.Log
import android.view.View
import javax.inject.Inject
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : BaseFragment() {

    @Inject
    lateinit var viewModel: LoginVM

    override fun layoutRes() = R.layout.login_fragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login()
    }


    private fun login(){
        var email = emailInput.text
        var pw = passwordInput.text
        loginBtn.setOnClickListener{
            //viewmodel func
        }
    }

}