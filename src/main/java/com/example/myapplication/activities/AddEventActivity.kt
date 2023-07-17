package com.example.myapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.models.UserDataModel
import com.example.myapplication.databinding.ActivityAddEventBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class AddEventActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddEventBinding
    private lateinit var db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_event)
        binding = ActivityAddEventBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //binding save button
        binding.saveButton.setOnClickListener {
            saveData()
        }
    }

    private fun saveData(){


        val name = binding.eventName.text.toString()
        val location = binding.eventLocation.text.toString()
        val date = binding.eventDate.text.toString()
        val time = binding.eventTime.text.toString()

        if(name.isEmpty()){
            Toast.makeText(this,"Name is Empty",Toast.LENGTH_LONG).show()
            return
        }

        if(location.isEmpty()){
            Toast.makeText(this,"Location is Empty",Toast.LENGTH_LONG).show()
            return
        }

        if(date.isEmpty()){
            Toast.makeText(this,"Date is Empty",Toast.LENGTH_LONG).show()
            return
        }

        if(time.isEmpty()){
            Toast.makeText(this,"Time is Empty",Toast.LENGTH_LONG).show()
            return
        }


        db = FirebaseDatabase.getInstance().getReference("Event Directory")
        val users = UserDataModel(name, location, date, time)

        db.child(name).setValue(users)
            .addOnSuccessListener{
                // Display a success message and clear the EditText fields
                Toast.makeText(this,"Data Inserted Successfully",Toast.LENGTH_LONG).show()
                binding.eventName.text.clear()
                binding.eventLocation.text.clear()
                binding.eventDate.text.clear()
                binding.eventTime.text.clear()

                Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show()

                val intent = Intent(this@AddEventActivity,MainActivity22::class.java)
                startActivity(intent)
                finish()
            }
            .addOnFailureListener{ err ->
                Toast.makeText(this,"Data failed ${err.message}",Toast.LENGTH_LONG).show()
            }
    }
}