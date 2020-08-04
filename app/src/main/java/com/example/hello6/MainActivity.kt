package com.example.hello6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Textview =findViewById<TextView>(Id.nameTextview)
        val Textview =findViewById<TextView>(R.Id.nameTextview)
        val EditTexview =findViewById<EditText>(R.Id.EditTextview)
        val EditText =findViewById<EditText>(R.id.EditText)
    }
}
