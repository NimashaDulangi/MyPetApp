package com.example.myapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMain6Binding
import com.example.myapplication.databinding.ActivityMain9Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity22 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //add onclick listner to main add event button
        binding.addEventButton.setOnClickListener {
            val intent= Intent(this@MainActivity22, AddEventActivity::class.java)
            startActivity(intent)
            finish()
        }
        //add onclick listner to main update button
        binding.updateBtn.setOnClickListener {
            val intent= Intent(this@MainActivity22, UpdateActivity::class.java)
            startActivity(intent)
            finish()
        }


        //add onclick listner to main delete button
        binding.deleteBtn.setOnClickListener {
            val intent= Intent(this@MainActivity22, DeleteActivity::class.java)
            startActivity(intent)
            finish()
        }

       binding.viewBtn.setOnClickListener {
           val intent =Intent(this@MainActivity22,MainActivity6::class.java)
           startActivity(intent)
           finish()
       }


    }
}