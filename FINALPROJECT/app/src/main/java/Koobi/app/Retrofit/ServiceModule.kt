package Koobi.app.Retrofit

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ServiceModule {

    @Singleton
    @Provides
    fun provideService(retrofit: Retrofit) : ApiService {
        return retrofit.create(ApiService::class.java)
    }
}