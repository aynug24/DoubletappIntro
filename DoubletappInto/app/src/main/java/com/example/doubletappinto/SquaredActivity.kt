package com.example.doubletappinto

import android.os.Bundle
import android.widget.TextView

class SquaredActivity : LoggedActivity() {
    override val TAG: String = "SquaredActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_squared)

        val value: Int = getIntent().getStringExtra("VALUE")?.toInt() ?: 0
        val sqr: Int = value * value;

        val txtView: TextView = findViewById(R.id.txt_square)
        txtView.setText(sqr.toString())
    }
}