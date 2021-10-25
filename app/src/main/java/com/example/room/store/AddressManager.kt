package com.example.room.store

import androidx.room.Room
import com.example.room.MyApp


class AddressManager {
    var appDatabase: AppDatabase? = null

    init {
        appDatabase = Room.databaseBuilder(MyApp.app, AppDatabase::class.java, "addresses")
            .allowMainThreadQueries()
            .build()
    }

    companion object {
        val instance: AddressManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            AddressManager()
        }
    }
}

