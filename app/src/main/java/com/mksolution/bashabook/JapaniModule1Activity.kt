package com.mksolution.bashabook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mksolution.bashabook.databinding.ActivityJapaniModule1Binding

class JapaniModule1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityJapaniModule1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJapaniModule1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backButton.setOnClickListener {
            finish()
        }
    }
}