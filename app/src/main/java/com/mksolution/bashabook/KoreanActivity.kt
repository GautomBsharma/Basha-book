package com.mksolution.bashabook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mksolution.bashabook.databinding.ActivityKoreanBinding

class KoreanActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKoreanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKoreanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardModule1.setOnClickListener {
            startActivity(Intent(this,KoreanModule1Activity::class.java))
        }
        binding.cardModule2.setOnClickListener {
            val intent = Intent(this,LearnLanguageActivity::class.java)
            intent.putExtra("MODULE_NAME","China_module_two")
            startActivity(intent)
        }
        binding.cardModule3.setOnClickListener {
            val intent = Intent(this,LearnLanguageActivity::class.java)
            intent.putExtra("MODULE_NAME","China_module_three")
            startActivity(intent)
        }
        binding.cardModule4.setOnClickListener {
            val intent = Intent(this,LearnLanguageActivity::class.java)
            intent.putExtra("MODULE_NAME","China_module_four")
            startActivity(intent)
        }
        binding.cardModule5.setOnClickListener {
            val intent = Intent(this,LearnLanguageActivity::class.java)
            intent.putExtra("MODULE_NAME","China_module_five")
            startActivity(intent)
        }
    }
}