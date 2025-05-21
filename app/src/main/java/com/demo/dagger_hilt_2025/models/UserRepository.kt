package com.demo.dagger_hilt_2025.models

import android.util.Log
import javax.inject.Inject

// This is class where we can create dependency via create constructor
// like @Inject constructor()
// But for some class which we don't have access for those class we need to create module class
// Module class will provide object of those classes
// Like Retrofit, firebase, Abstract class etc..

val TAG = "UserRepositoryLog"

class UserRepository @Inject constructor() {

    // This is just for test DI setup testing
    fun saveUser(email: String, pass: String) {
        // Logic
        Log.d(TAG, "saveUser success")
    }
}