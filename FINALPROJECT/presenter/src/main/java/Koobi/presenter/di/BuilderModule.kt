package Koobi.presenter.di

import Koobi.presenter.view.HostActivity
import Koobi.presenter.view.fragments.*
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BuilderModule {

    @ContributesAndroidInjector
    abstract fun provideHostActivity() : HostActivity
    @ContributesAndroidInjector
    abstract fun provideTestFragment() : TestFragment
    @ContributesAndroidInjector
    abstract fun provideCommandFragment() : CommandFragment
    @ContributesAndroidInjector
    abstract fun provideProfileFragment() : ProfileFragment
}