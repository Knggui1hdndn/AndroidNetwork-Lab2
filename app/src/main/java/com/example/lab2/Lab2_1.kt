package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.lab2.databinding.ActivityMainBinding

class  Lab2_1  : AppCompatActivity(), ApiContract.View {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            val apiPresenter = ApiClientPresenter(this@Lab2_1 )
            btnSend.setOnClickListener {
                binding.progress.visibility=View.VISIBLE
                apiPresenter.getApiLab2_1(edtName.text.toString(), edtScore.text.toString())
            }

        }
    }

    override fun onSuccess(rs: String) {
        binding.txtRs.text = "Result: "+rs
        binding.progress.visibility=View.GONE
    }

    override fun onFailure(e: String) {
        Toast.makeText(this, e, Toast.LENGTH_SHORT).show()
        binding.progress.visibility=View.GONE

    }
}