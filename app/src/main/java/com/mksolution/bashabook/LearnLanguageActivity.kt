package com.mksolution.bashabook

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.mksolution.bashabook.Adapter.LanguageAdapter
import com.mksolution.bashabook.Model.Learn
import com.mksolution.bashabook.databinding.ActivityLearnLanguageBinding

class LearnLanguageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLearnLanguageBinding
    private lateinit var database: FirebaseDatabase

    private lateinit var auth: FirebaseAuth
    private lateinit var adapter: LanguageAdapter
    private var learnLanguaList: ArrayList<Learn>?=null
    var moduleName :String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLearnLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = FirebaseAuth.getInstance()

        database = FirebaseDatabase.getInstance()
        val uid = auth.currentUser?.uid
        learnLanguaList = ArrayList()
        binding.learnlangrecye.layoutManager = LinearLayoutManager(this)
        adapter = learnLanguaList?.let { LanguageAdapter(this, it) }!!
        binding.learnlangrecye.adapter = adapter
        moduleName = intent.getStringExtra("MODULE_NAME").toString()
        gettool()
        binding.addLearnJapani.setOnClickListener {
            val intent = Intent(this,AddLearnActivity::class.java)
            intent.putExtra("PATH",moduleName)
            startActivity(intent)
        }
       val ref = FirebaseDatabase.getInstance().reference.child("Admin")
        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    for (snap in snapshot.children){
                        val data = snap.getValue(Admin::class.java)
                        if (data != null) {
                            if (uid  == data.AdminId){
                                binding.addLearnJapani.visibility = View.VISIBLE
                            }

                        }
                    }
                }
            }
            override fun onCancelled(error: DatabaseError) {

            }
        })
    }
    private fun gettool() {
        val reff = FirebaseDatabase.getInstance().reference.child("Learn").child(moduleName)
        reff.addValueEventListener(object : ValueEventListener {
            @SuppressLint("NotifyDataSetChanged")
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    learnLanguaList?.clear()
                    for (snap in snapshot.children){
                        val data = snap.getValue(Learn::class.java)
                        if (data != null) {
                            learnLanguaList?.add(data)
                        }
                    }
                    adapter.notifyDataSetChanged()
                }
            }
            override fun onCancelled(error: DatabaseError) {

            }

        })
    }
}