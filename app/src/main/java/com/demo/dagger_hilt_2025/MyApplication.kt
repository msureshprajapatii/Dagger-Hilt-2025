package com.demo.dagger_hilt_2025

import android.app.Application
import com.demo.dagger_hilt_2025.models.UserRepo
import com.demo.dagger_hilt_2025.models.UserRepository
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication : Application() {

    // This is for constructor
    @Inject
    lateinit var userRepository: UserRepository


    // This is from module class
    @Inject
    lateinit var userRepo: UserRepo

    override fun onCreate() {
        super.onCreate()

        userRepository.saveUser("test@gmail.com", "123456")
        userRepo.saveUser("test@gmail.com")


    }

}