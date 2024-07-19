package com.example.todolist.data.room.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import com.example.todolist.data.room.daos.OTPCodeDao
import com.example.todolist.data.room.daos.UserDao
import com.example.todolist.data.room.models.OTPCode
import com.example.todolist.data.room.models.User


@Database(
    entities = [User::class, OTPCode::class],
    version = 2,
    exportSchema = false
)
abstract class TodolistDatabase: RoomDatabase(){
    abstract fun userDao(): UserDao
    abstract fun optCodeDao(): OTPCodeDao

    companion object{
        @Volatile
        var INSTANCE: TodolistDatabase? = null

        fun getDatabase(context: Context): TodolistDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context = context,
                    TodolistDatabase::class.java,
                    name = "todolist_db"
                )
                    .fallbackToDestructtiveMigration()
                    .build()

                INSTANCE = instance
                return instance
            }
        }
    }
}
