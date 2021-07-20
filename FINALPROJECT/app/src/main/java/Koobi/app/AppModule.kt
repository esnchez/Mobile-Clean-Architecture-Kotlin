package Koobi.app

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
    class AppModule {
        @Provides
        fun provideContext(baseMyApp: MyApp) : Context = baseMyApp.applicationContext
}