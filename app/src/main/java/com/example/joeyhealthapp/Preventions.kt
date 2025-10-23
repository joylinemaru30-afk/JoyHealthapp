package com.example.joeyhealthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Preventions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preventions)
        val preventionweb=findViewById<WebView>(R.id.preventionswebview)
        preventionweb.loadUrl("file:///android_asset/prevention.html")
    }
}