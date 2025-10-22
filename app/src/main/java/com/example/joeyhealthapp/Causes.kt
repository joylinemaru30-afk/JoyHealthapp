package com.example.joeyhealthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Causes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_causes)
        val causesweb=findViewById<WebView>(R.id.causeswebview)
        causesweb.loadUrl("file:///android_asset/causes.html")
    }
}