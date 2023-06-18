package com.example.lenguagecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lenguagecontrol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ruBtn.setOnClickListener{
            languageUpdate(this, "ru")
            val intent = Intent(this,)
        }
        binding.uzBtn.setOnClickListener{
            languageUpdate(requireActivity = this, language = "uz")
        }
        binding.keyingi.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}