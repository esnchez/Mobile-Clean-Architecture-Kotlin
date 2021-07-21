package Koobi.app

import Koobi.app.Retrofit.RetrofitModule
import Koobi.app.Retrofit.ServiceModule
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
        BuilderModule::class
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
