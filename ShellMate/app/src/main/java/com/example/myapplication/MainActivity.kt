package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fabAdd: FloatingActionButton = findViewById(R.id.fab_add)
        fabAdd.setOnClickListener {
            // Tambahkan aksi untuk menambahkan data ke Firebase
        }

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Navigasi ke halaman Home
                    true
                }
                R.id.sales -> {
                    // Navigasi ke halaman Sales
                    true
                }
                R.id.cart -> {
                    // Navigasi ke halaman Cart
                    true
                }
                R.id.wallet -> {
                    // Navigasi ke halaman Wallet
                    true
                }
                else -> false
            }
        }
    }
}
