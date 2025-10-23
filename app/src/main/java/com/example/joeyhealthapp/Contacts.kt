package com.example.joeyhealthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Contacts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        val telweb=findViewById<WebView>(R.id.contactswebview)
        telweb.loadUrl("file:///android_asset/tel.html")
    }
}