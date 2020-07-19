package com.example.synrgy_mengenalviewgroup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.synrgy_mengenalviewgroup.R
import kotlinx.android.synthetic.main.activity_scroll_view.*

open class ScrollView : LinearLayoutActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)

        btnNext3.setOnClickListener{
            val intent = Intent (this, RelativeLayout::class.java)
            startActivity(intent)
        }

    }
}