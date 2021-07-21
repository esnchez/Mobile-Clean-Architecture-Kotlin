package Koobi.app.di.module

import Koobi.app.MyApp
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideContext(baseMyApp: MyApp) : Context = baseMyApp.applicationContext
}