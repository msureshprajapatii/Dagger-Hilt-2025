package com.demo.dagger_hilt_2025.models

import android.util.Log

// So here we can't create dependency object via constructor injection
// because we cant create object of User repo, so for that we will create module class
// module class will create object of userRepo and then we can use it.

class SQLiteRepository : UserRepo {
    override fun saveUser(email: String) {
        Log.d(TAG, "saveUser in SQLite ")
    }

}

class FirebaseRepository : UserRepo {
    override fun saveUser(email: String) {
        Log.d(TAG, "saveUser in firebase ")
    }

}

interface UserRepo {

    fun saveUser(email:String)
}