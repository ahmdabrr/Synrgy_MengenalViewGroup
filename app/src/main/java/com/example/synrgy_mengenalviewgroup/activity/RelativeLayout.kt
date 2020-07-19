package com.example.synrgy_mengenalviewgroup.activity


import android.content.Intent
import android.os.Bundle
import com.example.synrgy_mengenalviewgroup.R.layout.activity_relative_layout
import kotlinx.android.synthetic.main.activity_relative_layout.*

open class RelativeLayout : ScrollView() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_relative_layout)

        btnNext4.setOnClickListener{
            val intent = Intent (this, GridLayout::class.java)
            startActivity(intent)
        }
    }
}