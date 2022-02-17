package com.example.doubletappinto

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    var value: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        value++
    }

    fun squareClick(view: View) {
        val intent = Intent(
            this,
            SquareActivity::class.java
        ).apply {
            val bundle = Bundle().apply { putString("VALUE", value.toString()) }
            putExtras(bundle)
        }

        startActivity(intent)
    }
}