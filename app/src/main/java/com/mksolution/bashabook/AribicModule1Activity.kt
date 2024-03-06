package com.mksolution.bashabook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mksolution.bashabook.databinding.ActivityAribicModule1Binding

class AribicModule1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityAribicModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAribicModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButton.setOnClickListener {
            finish()
        }
    }
}