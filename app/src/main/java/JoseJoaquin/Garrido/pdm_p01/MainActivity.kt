package com.example.pdm_p01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val et = findViewById<EditText>(R.id.textEditToSend)
        val menssage = et.text.toString()
        val intent = Intent (this, SecondActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, menssage)
        }
        startActivity(intent)
    }

    fun changeText (view: View) {
        val et = findViewById<EditText>(R.id.textEditToSend)
        val textView = findViewById<TextView>(R.id.textViewChange)

        textView.setText(et.getText())
    }
}