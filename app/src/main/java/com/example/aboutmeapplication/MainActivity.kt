package com.example.aboutmeapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.aboutmeapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonChange.setOnClickListener {
            var editTextNickName = binding.editTextNickName.text
            binding.tvNickname.text = editTextNickName
            binding.editTextNickName.visibility = View.GONE
            binding.buttonChange.visibility = View.GONE
            binding.tvNickname.visibility = View.VISIBLE
            it.hydeKeyBoard()
        }

        binding.tvNickname.setOnClickListener {
            it.hydeKeyBoard()
            binding.editTextNickName.visibility = View.VISIBLE
            binding.buttonChange.visibility = View.VISIBLE
            binding.tvNickname.visibility = View.GONE
        }
    }
}
