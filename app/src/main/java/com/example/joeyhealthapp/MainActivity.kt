package com.example.joeyhealthapp

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //find all the cardviews by use of there ids and do an explicit intent to diffrent activities
        val cardAbout=findViewById<CardView>(R.id.cardabout)
        val cardcauses=findViewById<CardView>(R.id.cardcause)
        val cardprevention=findViewById<CardView>(R.id.cardprevention)
        val cardsymptoms=findViewById<CardView>(R.id.cardsymptoms)
        val cardareas =findViewById<CardView>(R.id.cardlocation)
        val cardcontacts=findViewById<CardView>(R.id.cardtel)


        cardAbout.setOnClickListener{
            val aboutpage =Intent(applicationContext,About::class.java)
            startActivity(aboutpage)
        } //endlistener
        cardcauses.setOnClickListener{
            val causespage=Intent(applicationContext,Causes::class.java)
            startActivity(causespage)
        } //endlistener
        cardprevention.setOnClickListener{
            val preventionspage=Intent(applicationContext,Preventions::class.java)
            startActivity(preventionspage)
        } //endlistener

        cardsymptoms.setOnClickListener{
            val symptomspage=Intent(applicationContext,Symptoms::class.java)
            startActivity(symptomspage)
        } //endlistener
        cardareas.setOnClickListener{
            val affectedAreaspage=Intent(applicationContext,AffectedAreas::class.java)
            startActivity(affectedAreaspage)

        } //endlistener
            cardcontacts.setOnClickListener{
            val contactspage=Intent(applicationContext,Contacts::class.java)
            startActivity(contactspage)

        } //endlistener



    }

}