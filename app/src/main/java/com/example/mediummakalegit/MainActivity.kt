package com.example.mediummakalegit

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("1. commit")
        println("2. commit")
        println("3. commit")

        println("Stash örnek1")
        println("Stash örnek2")

        println("Bu satir dev branch'inde yazildi ve birazdan main'e merge edilecek")

        println("Arkadaşımızın buraya bir şeyler eklediğini varsayalım.")
        println("Biz de buraya bir şeyler ekledik.")
    }
}