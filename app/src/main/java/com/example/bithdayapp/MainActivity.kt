package com.example.bithdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val button=findViewById<Button>(R.id.createmsg)
//        button.setOnClickListener {  }
//
//        }
    }

    fun createCard(view: View) {
        val name=findViewById<EditText>(R.id.nameinput).editableText.toString()
        //Toast.makeText(this, "$name", Toast.LENGTH_SHORT).show()


        val intent=Intent(this,greeting::class.java)
        intent.putExtra(greeting.NAME_EXTRA,name)
        startActivity(intent)

    }
}