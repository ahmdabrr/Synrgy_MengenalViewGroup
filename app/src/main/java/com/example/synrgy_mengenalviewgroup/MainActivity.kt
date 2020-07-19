package com.example.synrgy_mengenalviewgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.synrgy_mengenalviewgroup.activity.LinearLayoutActivity
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext1.setOnClickListener{
            val intent = Intent (this, LinearLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}