package com.example.synrgy_mengenalviewgroup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.synrgy_mengenalviewgroup.MainActivity
import com.example.synrgy_mengenalviewgroup.R
import kotlinx.android.synthetic.main.activity_linear_layout.*

open class LinearLayoutActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        btnNext2.setOnClickListener{
            val intent = Intent (this, ScrollView::class.java)
            startActivity(intent)
        }

    }
}