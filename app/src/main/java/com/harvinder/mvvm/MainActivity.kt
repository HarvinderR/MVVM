package com.harvinder.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.harvinder.mvvm.databinding.ActivityMainBinding
import com.harvinder.mvvm.model.User

class MainActivity : AppCompatActivity() {
    lateinit var user:User;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        user = User("Harvinder","E2-138")
        binding.user = user
    }
}