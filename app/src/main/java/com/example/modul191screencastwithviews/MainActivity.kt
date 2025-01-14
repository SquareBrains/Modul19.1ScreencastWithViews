package com.example.modul191screencastwithviews

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val root = findViewById<ViewGroup>(R.id.root)
        val view = layoutInflater.inflate(R.layout.item,root, false)
        root.addView(view)
        val view1 = layoutInflater.inflate(R.layout.item,root, false)
        view1.visibility = View.INVISIBLE
        root.addView(view1)
        val view2 = layoutInflater.inflate(R.layout.item,root, false)
        view2.isEnabled = false
        root.addView(view2)
        val view3 = layoutInflater.inflate(R.layout.item,root, false)
        view3.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent))
        view3.setOnClickListener { }
        root.addView(view3)


    }
}