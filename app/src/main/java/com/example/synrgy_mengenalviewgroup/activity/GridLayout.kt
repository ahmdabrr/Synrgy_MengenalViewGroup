package com.example.synrgy_mengenalviewgroup.activity

import android.content.Intent
import android.os.Bundle
import com.example.synrgy_mengenalviewgroup.R.layout.activity_grid_layout
import kotlinx.android.synthetic.main.activity_grid_layout.*

open class GridLayout : RelativeLayout() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_grid_layout)

        btn55.setOnClickListener{
            val intent = Intent (this, FrameLayout::class.java)
            startActivity(intent)
        }


    }
}