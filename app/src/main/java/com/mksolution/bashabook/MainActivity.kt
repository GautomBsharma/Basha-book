package com.mksolution.bashabook


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mksolution.bashabook.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cardarobic.setOnClickListener {
            startActivity(Intent(this,ArobicActivity::class.java))
        }

        binding.malayshi.setOnClickListener {
            startActivity(Intent(this,MaloyActivity::class.java))
        }
        binding.japani.setOnClickListener {
            startActivity(Intent(this,JapaniActivity::class.java))
        }
        binding.korean.setOnClickListener {
            startActivity(Intent(this,KoreanActivity::class.java))
        }


    }
}