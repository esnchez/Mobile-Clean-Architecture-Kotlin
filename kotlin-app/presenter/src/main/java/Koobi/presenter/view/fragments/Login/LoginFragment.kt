package Koobi.presenter.view.fragments.Login

import Koobi.presenter.R
import Koobi.presenter.view.base.BaseFragment
import Koobi.presenter.view.fragments.test.TestVM
import javax.inject.Inject

class LoginFragment : BaseFragment() {

    @Inject
    lateinit var viewModel: LoginVM

    override fun layoutRes() = R.layout.login_fragment


}