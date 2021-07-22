package Koobi.presenter.di

import Koobi.presenter.di.utils.ViewModelFactory
import Koobi.presenter.di.utils.ViewModelKey
import Koobi.presenter.view.fragments.test.TestVM
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(TestVM::class)
    abstract fun bindHomeViewModel(testVM: TestVM) : ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory) : ViewModelProvider.Factory
}