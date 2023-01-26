package com.example.screen2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class ThirdFragment : Fragment() {
    lateinit var mTxt4: TextView
    lateinit var mTxt5: TextView
    lateinit var mBtn: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_third, container, false)

        mTxt4 = view.findViewById(R.id.fragment3_txt4)
        mTxt5 = view.findViewById(R.id.fragment3_txt5)
        mBtn.setOnClickListener {

        }
        return view

    }

}