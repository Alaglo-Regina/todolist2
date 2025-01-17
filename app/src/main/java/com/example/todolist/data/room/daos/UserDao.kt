package com.example.todolist.data.room.daos

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.todolist.data.room.models.User
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun register(user: User)

    @Query("SELECT * FROM users")
    fun usersList(): Flow<List<User>>

    @Query("SELECT * FROM users WHERE email =:email AND state = 1")
    fun getUserByEmail(email: String): Flow<List<User>>

    @Query("UPDATE users SET state = 1 WHERE email =:email")
    fun activateUserByEmail(email: String): Flow<List<User>>
}