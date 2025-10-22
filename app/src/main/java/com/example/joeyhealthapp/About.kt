package com.example.joeyhealthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        //find the webview by use of the ID and load the html page
        val aboutweb=findViewById<WebView>(R.id.aboutwebview)
        aboutweb.loadUrl("file:///android_asset/about.html")
    }
}