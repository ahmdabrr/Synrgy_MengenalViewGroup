package com.example.synrgy_mengenalviewgroup.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.synrgy_mengenalviewgroup.R
import com.example.synrgy_mengenalviewgroup.R.layout.activity_card_view
import kotlinx.android.synthetic.main.activity_card_view.*

open class CardView : FrameLayout() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_card_view)

        btn_next78.setOnClickListener{
            val intent = Intent (this, TableLayout::class.java)
            startActivity(intent)
        }


    }
}