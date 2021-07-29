package Koobi.data.di

import Koobi.data.api.ApiService
import Koobi.data.repositories.JokeRepositoryImpl
import Koobi.domain.repositories.JokeRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideJokeRepository(service : ApiService) : JokeRepository = JokeRepositoryImpl(service)

}