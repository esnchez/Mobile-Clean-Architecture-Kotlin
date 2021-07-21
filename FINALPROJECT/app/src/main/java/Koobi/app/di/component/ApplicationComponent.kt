package Koobi.app.di.component

import Koobi.app.MyApp
import Koobi.app.di.module.AppModule
import Koobi.data.di.*
import Koobi.domain.di.*
import Koobi.presenter.di.*


import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        RetrofitModule::class,
        ServiceModule::class,
        BuilderModule::class,
        UseCaseModule::class
    ]
)

interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: MyApp): Builder
        fun build(): ApplicationComponent
    }
    fun inject(app: MyApp)
}

