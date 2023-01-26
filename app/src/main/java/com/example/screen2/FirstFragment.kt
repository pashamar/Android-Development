package com.example.screen2

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import java.net.PasswordAuthentication
import java.util.regex.Pattern

class FirstFragment : Fragment() {
    lateinit var mTxt1: TextView
    lateinit var mEmail: EditText
    lateinit var mPassword: EditText
    lateinit var mBtn: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_first, container, false)
        mTxt1 = view.findViewById(R.id.fragment1_txt1)
        mEmail = view.findViewById(R.id.fragment1_email)
        mPassword = view.findViewById(R.id.fragment1_password)
        mBtn.setOnClickListener {

        }
        return view
    }

}

