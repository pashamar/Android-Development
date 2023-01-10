package com.example.screen2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    lateinit var mButton: AppCompatButton
    lateinit var Password: EditText
    lateinit var Email: EditText
    var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+[a-z]+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton = findViewById(R.id.button);
        Password = findViewById(R.id.password)
        Email = findViewById(R.id.email)
        checkPassword(Password.text.toString().length)
        checkEmail(Email.text.toString().length)


        mButton.setOnClickListener {
            Toast.makeText(this, "Pressed", Toast.LENGTH_LONG).show()
            mButton.text = "Button clicked!"

            if (Email.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "enter email address", Toast.LENGTH_LONG).show()
            } else {
                if (Email.text.toString().trim() { it <= ' ' }.matches(emailPattern.toRegex()))
                    Toast.makeText(applicationContext, "valid email address", Toast.LENGTH_LONG)
                        .show()
            }else{
            Toast.makeText(applicationContext, "Invalid email address", Toast.LENGTH_LONG).show()
        }

            if (Password.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "enter password", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Invalid password", Toast.LENGTH_LONG).show()
            }

        }
    }

    fun checkPassword(passwordSize: Int): Boolean {
        if (passwordSize < 8 && passwordSize > 4) {
            return true;
        } else {
            return false;
        }
    }

    fun checkEmail(emailSize: Int): Boolean {
        if (emailSize < 12 && emailSize > 5) {
            return true;
        } else {
            return false
        }

    }

}

