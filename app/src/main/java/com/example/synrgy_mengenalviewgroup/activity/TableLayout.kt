package com.example.synrgy_mengenalviewgroup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.synrgy_mengenalviewgroup.R
import com.example.synrgy_mengenalviewgroup.R.layout.activity_table_layout
import kotlinx.android.synthetic.main.activity_table_layout.*

open class TableLayout : CardView() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_table_layout)

        butNext77.setOnClickListener{
            val intent = Intent (this, ConstraintLayout::class.java)
            startActivity(intent)
        }
    }
}