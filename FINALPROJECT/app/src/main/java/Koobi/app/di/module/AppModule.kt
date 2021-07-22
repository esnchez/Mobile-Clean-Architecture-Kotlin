package Koobi.app.di.module

import Koobi.app.MyApp
import Koobi.presenter.di.utils.ViewModelFactory
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    fun provideContext(baseMyApp: MyApp) : Context = baseMyApp.applicationContext

    @Provides
    @Singleton
    fun provideViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory = factory
}