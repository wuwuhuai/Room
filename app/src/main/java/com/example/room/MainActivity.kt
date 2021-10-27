package com.example.room

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.room.databinding.ActivityMainBinding
import com.example.room.store.AddressManager
import com.example.room.store.User

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setupListener()

    }

    private fun setupListener() {
        binding.apply {
            tvAdd.setOnClickListener(this@MainActivity)
            tvDelete.setOnClickListener(this@MainActivity)
            tvRead.setOnClickListener(this@MainActivity)
            tvUpdate.setOnClickListener(this@MainActivity)
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.tv_add -> {
                AddressManager.instance.appDb.userDao().insertAll(User.mock())
            }
            R.id.tv_delete -> {
                AddressManager.instance.appDb.userDao().delete(User.mock())
            }
            R.id.tv_update -> {
                AddressManager.instance.appDb.userDao().update(User.mockUpdate())
            }
            R.id.tv_read -> {
                val users = AddressManager.instance.appDb.userDao().getAll()
                binding.tvData.text  = users.toString()
            }
        }
    }
}