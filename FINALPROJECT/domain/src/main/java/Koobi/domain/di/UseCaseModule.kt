package Koobi.domain.di

import Koobi.domain.repositories.JokeRepository
import Koobi.domain.usecases.JokeUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {
    @Provides
    @Singleton
    fun provideJokeUseCase(jokeRepository: JokeRepository) : JokeUseCase = JokeUseCase(jokeRepository)
}