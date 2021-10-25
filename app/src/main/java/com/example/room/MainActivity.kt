package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.room.store.AddressManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AddressManager.instance.appDatabase?.userDao()?.insertAll()


    }
}