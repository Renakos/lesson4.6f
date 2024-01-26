package com.example.lesson46f.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson46f.fragment.GalleryFragment
import com.example.lesson46f.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, GalleryFragment())
            .commit()
    }
}