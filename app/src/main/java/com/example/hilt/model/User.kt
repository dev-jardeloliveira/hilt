package com.example.hilt.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val uid:Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "name") val email: String?,
    @ColumnInfo(name = "name") val phone: String?,

)
