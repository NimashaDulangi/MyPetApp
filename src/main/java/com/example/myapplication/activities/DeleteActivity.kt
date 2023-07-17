package com.example.myapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityDeleteBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class DeleteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDeleteBinding
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.deleteButton2.setOnClickListener {
            val name = binding.deleteEventName.text.toString()
            if (name.isNotEmpty()){
                deleteData(name)
            }else{
                Toast.makeText(this, "Please enter event name", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun deleteData(name: String){
        db = FirebaseDatabase.getInstance().getReference("Event Directory")
        db.child(name).removeValue().addOnSuccessListener {
            binding.deleteEventName.text.clear()
            Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show()

            val intent = Intent(this@DeleteActivity,MainActivity22::class.java)
            startActivity(intent)
            finish()

        }.addOnFailureListener {
            Toast.makeText(this, "Unable to Delete", Toast.LENGTH_SHORT).show()
        }
    }
}