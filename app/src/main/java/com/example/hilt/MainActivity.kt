package com.example.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.hilt.database.Database
import com.example.hilt.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val instance = Room.databaseBuilder(
            applicationContext,
            Database::class.java, "db"
        ).build()

       val db = instance.userDao()
        var user = User(uid = 1,name = "test",email = "email@dominio.com",phone = "31999995555")
        val r = db.insert(user)

    }
}