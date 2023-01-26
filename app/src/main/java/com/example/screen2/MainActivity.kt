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
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    lateinit var mButton: AppCompatButton
    lateinit var Password: EditText
    lateinit var Email: EditText
    var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+[a-z]+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first)
        mButton = findViewById(R.id.fragment1_button)
        Password = findViewById(R.id.fragment1_password)
        Email = findViewById(R.id.fragment1_email)
        checkPassword(Password.text.toString().length)
        checkEmail(Email.text.toString().length)

        supportFragmentManager.beginTransaction().add(R.id.fragment_container, FirstFragment(),).commit()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, SecondFragment(),).commit()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, ThirdFragment(),).commit()

        mButton.setOnClickListener {
            Toast.makeText(this, "Pressed", Toast.LENGTH_LONG).show()
            mButton.text = "Button clicked!"

            if (Email.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "enter email address", Toast.LENGTH_LONG).show()
            }else if (Email.text.toString().trim() { it <= ' ' }.matches(emailPattern.toRegex())){
                    Toast.makeText(applicationContext, "valid email address", Toast.LENGTH_LONG)
                        .show()

            }else
            {
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

    fun passwordValidate(text: String?): Boolean {
        var p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{5,20}\$")
        var m = p.matcher(text)
        return m.matches()
    }

    fun checkEmail(emailSize: Int): Boolean {
        if (emailSize < 12 && emailSize > 5) {
            return true;
        } else {
            return false
        }
    }

}


