package com.example.doubletappinto

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : LoggedActivity() {
    var value: Int = 0
    var txtView: TextView? = null

    override val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView = findViewById(R.id.txt_value)
        txtView?.setText(value.toString())
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        println("Change")

        value++
        txtView?.setText(value.toString())
    }

    fun squareClick(view: View) {
        val intent = Intent(
            this,
            SquaredActivity::class.java
        ).apply {
            val bundle = Bundle().apply { putString("VALUE", value.toString()) }
            putExtras(bundle)
        }

        startActivity(intent)
    }
}