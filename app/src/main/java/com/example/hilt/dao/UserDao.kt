package com.example.hilt.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.hilt.model.User

@Dao
interface UserDao {
    @Query("SELECT * FROM User")
    fun getAll()

    @Insert
    fun insert(vararg user: User)

    @Delete
    fun delete(user: User)
}