package Koobi.data.di

import Koobi.data.api.ApiService
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