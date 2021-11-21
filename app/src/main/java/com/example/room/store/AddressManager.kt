package com.example.room.store

import androidx.room.Room
import com.example.room.MyApp


class AddressManager {
    val appDb by lazy {
        Room.databaseBuilder(MyApp.app, AppDatabase::class.java, "addresses")
            .allowMainThreadQueries()
            .addMigrations(*(RoomMigration.instance.migrations.toTypedArray()))
            .build()
    }


    companion object {
        val instance: AddressManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            AddressManager()
        }
    }
}

