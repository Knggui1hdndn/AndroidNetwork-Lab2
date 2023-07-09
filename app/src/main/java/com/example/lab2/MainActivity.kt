package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab2.databinding.ActivityMain2Binding
import com.example.lab2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
             btn1.setOnClickListener {
                startActivity(Intent(this@MainActivity,Lab2_1::class.java))
            }
            btn2.setOnClickListener {
                startActivity(Intent(this@MainActivity,Lab2_2::class.java))
            }
        }
    }
}