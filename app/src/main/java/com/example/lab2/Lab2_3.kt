package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.lab2.databinding.ActivityLab22Binding
import com.example.lab2.databinding.ActivityLab23Binding
import com.example.lab2.databinding.ActivityMainBinding

class Lab2_3 : AppCompatActivity(), ApiContract.View {
    private lateinit var binding: ActivityLab23Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLab23Binding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            val apiPresenter = ApiClientPresenter(this@Lab2_3)
            btnSend.setOnClickListener {
                binding.progress.visibility = View.VISIBLE
                apiPresenter.getApiLab2_3(edtCanh.text.toString())
            }

        }
    }

    override fun onSuccess(rs: String) {
        binding.txtRs.text = rs
        binding.progress.visibility = View.GONE
    }

    override fun onFailure(e: String) {
        Toast.makeText(this, e, Toast.LENGTH_SHORT).show()
        binding.progress.visibility = View.GONE

    }
}