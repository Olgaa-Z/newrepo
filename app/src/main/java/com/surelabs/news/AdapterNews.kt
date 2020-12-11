package com.surelabs.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AdapterNews : AppCompatActivity() {

    lateinit var gambar : ImageView
    lateinit var judul : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter_news)

        gambar= findViewById(R.id.gambarnews)
        judul = findViewById(R.id.judulnews)

    }
}