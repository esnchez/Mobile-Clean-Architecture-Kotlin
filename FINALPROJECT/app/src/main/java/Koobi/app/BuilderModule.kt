package Koobi.app

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuilderModule {

    @ContributesAndroidInjector
    abstract fun provideMainActivity() : MainActivity
    @ContributesAndroidInjector
    abstract fun provideTestFragment() : testFragment
}