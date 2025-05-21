package com.demo.dagger_hilt_2025

import android.util.Log
import javax.inject.Inject

val TAG = "UserRepositoryLog"

class UserRepository @Inject constructor() {

    fun saveUser(email: String, pass: String) {
        // Logic
        Log.d(TAG, "saveUser success")
    }
}