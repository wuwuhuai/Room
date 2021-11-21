package com.example.room.store

import androidx.room.*

@Database(entities = [User::class], version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}


