package com.encoders.livedatainkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.encoders.livedatainkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel  = ViewModelProvider(this)[MainViewModel::class.java]
        mainViewModel.usernames.observe(this, Observer {
            binding.username.text =  it.toString()
        })

        binding.updateName.setOnClickListener {
            mainViewModel.Update_Name()
        }

    }
}