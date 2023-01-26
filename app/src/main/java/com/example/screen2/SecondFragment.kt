package com.example.screen2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class SecondFragment : Fragment() {
    lateinit var mTxt2: TextView
    lateinit var mTxt3: TextView
    lateinit var mBtn: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_second, container, false)
        mTxt2 = view.findViewById(R.id.fragment2_txt2)
        mTxt3 = view.findViewById(R.id.fragment2_txt3)
        mBtn.setOnClickListener {

        }
        return view
    }


}

