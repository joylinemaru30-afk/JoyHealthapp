package com.example.joeyhealthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Symptoms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptoms)
        val symptomsweb=findViewById<WebView>(R.id.symptomswebview)
        symptomsweb.loadUrl("file:///android_asset/causes.html")


    }
}