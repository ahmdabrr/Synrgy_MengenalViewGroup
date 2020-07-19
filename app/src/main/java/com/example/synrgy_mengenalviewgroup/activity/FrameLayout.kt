package com.example.synrgy_mengenalviewgroup.activity

import android.content.Intent
import android.os.Bundle
import com.example.synrgy_mengenalviewgroup.R.layout.activity_frame_layout
import kotlinx.android.synthetic.main.activity_frame_layout.*
import kotlinx.android.synthetic.main.activity_grid_layout.*

open class FrameLayout : GridLayout() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_frame_layout)

        btnNext6.setOnClickListener{
            val intent = Intent (this, CardView::class.java)
            startActivity(intent)
        }
    }
}