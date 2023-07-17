package com.example.myapplication.activities



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMain6Binding
import com.example.myapplication.databinding.ActivityMain9Binding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity6 : AppCompatActivity() {


    private lateinit var binding: ActivityMain6Binding
    private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.searchButton2.setOnClickListener {
            val name: String = binding.searchButton2.text.toString()
            if (name.isNotEmpty()) {
                readData(name)
            } else {
                Toast.makeText(this, "Enter event name", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun readData(name: String) {
        databaseReference = FirebaseDatabase.getInstance().getReference("Event Directory")
        databaseReference.child(name).get().addOnSuccessListener {
            if (it.exists()) {
                val location = it.child("location").value
                val name = it.child("name").value
                val date = it.child("date").value
                val time = it.child("time").value

                Toast.makeText(this, "Result Found", Toast.LENGTH_SHORT).show()
                binding.searchEventName.text.clear()


                binding.searchButton2.setOnClickListener {
                    binding.searchEventName1.text = name.toString()
                    binding.searchEventLocation1.text=location.toString()
                    binding.searchEventDate1.text=date.toString()
                    binding.searchEventTime1.text=time.toString()



                }


            } else {
                Toast.makeText(this, "Event name is not exist", Toast.LENGTH_SHORT).show()

            }
        }.addOnFailureListener {
            Toast.makeText(this, "something went wrong", Toast.LENGTH_SHORT).show()
        }


    }
    fun updateData(){

    }
}

