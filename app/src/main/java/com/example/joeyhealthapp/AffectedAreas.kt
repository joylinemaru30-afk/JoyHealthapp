package com.example.joeyhealthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class AffectedAreas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affected_areas)
        val Areasaffectedweb=findViewById<WebView>(R.id.affectedareaswebview)
        Areasaffectedweb.loadUrl("file:///android_asset/areasaffected.html")

    }
}