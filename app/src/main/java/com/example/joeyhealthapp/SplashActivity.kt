package com.example.joeyhealthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //move to the main activity after five seconds
        Handler().postDelayed({
                              startActivity(Intent(applicationContext,MainActivity::class.java))
            finish()

        },5000)
        val logo1 = findViewById<ImageView>(R.id.logo1)
        val logo2 = findViewById<ImageView>(R.id.logo2)

        // Load the bounce-fade animations
        val bounceFade1 = AnimationUtils.loadAnimation(this, R.anim.bounce_fade)
        val bounceFade2 = AnimationUtils.loadAnimation(this, R.anim.bounce_fade_alt)

        // Start them
        logo1.startAnimation(bounceFade1)
        logo2.startAnimation(bounceFade2)

    }
}