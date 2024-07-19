package com.example.todolist.data.room.database

import android.content.Context
import com.example.todolist.data.room.repositories.OTPCodeRepository
import com.example.todolist.data.room.repositories.UserRepository


object Graph {

    private lateinit var todolistDatabase: TodolistDatabase

        private set

    val userRepository by lazy {
        UserRepository(
            userDao = todolistDatabase.userDao()
        )
    }

    val otpCodeRepository by lazy {
        OTPCodeRepository(
            otpCodeDao = todolistDatabase.otpCodeDao()
        )
    }

    fun provide(context: Context){
        todolistDatabase = TodolistDatabase.getDatabase(context = context)
    }
}