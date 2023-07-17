package com.example.myapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityUpdateBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UpdateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateBinding
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)
        binding = ActivityUpdateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding update button
        binding.updateButton.setOnClickListener {
            val updateEventName = binding.updateEventName.text.toString()
            val updateEventLocation = binding.updateEventLocation.text.toString()
            val updateEventDate = binding.updateEventDate.text.toString()
            val updateEventTime = binding.updateEventTime.text.toString()

            updateData(updateEventName, updateEventLocation, updateEventDate, updateEventTime)
        }
    }

    private fun updateData(name: String,location: String, date: String, time: String) {

        db = FirebaseDatabase.getInstance().getReference("Event Directory")
        val user = mapOf<String, String>("name" to name, "location" to location, "date" to date,"time" to  time)

        db.child(name).updateChildren(user).addOnSuccessListener {

                binding.updateEventName.text.clear()
                binding.updateEventLocation.text.clear()
                binding.updateEventDate.text.clear()
                binding.updateEventTime.text.clear()

                Toast.makeText(this, "Updated", Toast.LENGTH_SHORT).show()

            val intent = Intent(this@UpdateActivity,MainActivity22::class.java)
            startActivity(intent)
            finish()

            }.addOnFailureListener {
            Toast.makeText(this, "Unable to update", Toast.LENGTH_SHORT).show()
        }


    }
}
