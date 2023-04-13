package com.example.bithdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class greeting : AppCompatActivity() {
    companion object{

        const val NAME_EXTRA ="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val name=intent.getStringExtra(NAME_EXTRA)
        val button=findViewById<TextView>(R.id.bgreeting)
        button.text="happy birthday \n$name"
    }
}