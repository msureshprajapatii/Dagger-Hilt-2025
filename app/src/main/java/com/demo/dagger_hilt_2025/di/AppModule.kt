package com.demo.dagger_hilt_2025.di

import com.demo.dagger_hilt_2025.models.FirebaseRepository
import com.demo.dagger_hilt_2025.models.UserRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideFirebaseRepository(): UserRepo {
        return FirebaseRepository()
    }

}
