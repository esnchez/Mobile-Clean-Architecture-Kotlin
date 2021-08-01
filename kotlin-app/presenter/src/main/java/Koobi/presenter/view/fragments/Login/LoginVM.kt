package Koobi.presenter.view.fragments.Login

import Koobi.domain.usecases.JokeUseCase
import Koobi.domain.usecases.LoginUseCase
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginVM
@Inject constructor(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

}