package com.example.synrgy_mengenalviewgroup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.synrgy_mengenalviewgroup.MainActivity
import com.example.synrgy_mengenalviewgroup.R
import com.example.synrgy_mengenalviewgroup.R.layout.activity_constraint_layout
import kotlinx.android.synthetic.main.activity_constraint_layout.*

class ConstraintLayout : TableLayout() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_constraint_layout)

        btnKelar1.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}