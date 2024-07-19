package com.example.todolist.data.room.repositories

import android.provider.ContactsContract.CommonDataKinds.Email
import com.example.todolist.data.room.daos.UserDao
import com.example.todolist.data.room.models.User

class UserRepository(
    private val userDao: UserDao
) {
    val usersList = userDao.usersList()

    suspend fun register(user: User){userDao.register(user)}


    fun getUserByEmail(email: String): kotlinx.coroutines.flow.Flow<List<User>> = userDao.getUserByEmail(email)
    fun activateUserByEmail(email: String) = userDao.activateUserByEmail(email)
}