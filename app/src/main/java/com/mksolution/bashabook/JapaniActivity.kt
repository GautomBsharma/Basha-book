package com.mksolution.bashabook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mksolution.bashabook.databinding.ActivityJapaniBinding

class JapaniActivity : AppCompatActivity() {
    private lateinit var binding: ActivityJapaniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJapaniBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cardModule1.setOnClickListener {
            startActivity(Intent(this,JapaniModule1Activity::class.java))
        }
        binding.cardModule2.setOnClickListener {
            val intent = Intent(this,LearnLanguageActivity::class.java)
            intent.putExtra("MODULE_NAME","Japani_module_two")
            startActivity(intent)
        }
        binding.cardModule3.setOnClickListener {
            val intent = Intent(this,LearnLanguageActivity::class.java)
            intent.putExtra("MODULE_NAME","Japani_module_three")
            startActivity(intent)
        }
        binding.cardModule4.setOnClickListener {
            val intent = Intent(this,LearnLanguageActivity::class.java)
            intent.putExtra("MODULE_NAME","Japani_module_four")
            startActivity(intent)
        }
        binding.cardModule5.setOnClickListener {
            val intent = Intent(this,LearnLanguageActivity::class.java)
            intent.putExtra("MODULE_NAME","Japani_module_five")
            startActivity(intent)
        }
    }
}