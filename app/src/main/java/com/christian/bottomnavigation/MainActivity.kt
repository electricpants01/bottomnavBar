package com.christian.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.christian.bottomnavigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // para usar binding, primer debes hacer la linea 16 y 17 :D
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navBar = binding.mainNavBar
        val navController = findNavController(R.id.fragment)
        navBar.setupWithNavController(navController)
    }
}