package com.example.barbershop.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barbershop.R
import com.example.barbershop.databinding.ActivityHomeBinding
import com.example.barbershop.databinding.ActivityMainBinding

class Home : AppCompatActivity() {
   private lateinit var binding: ActivityHomeBinding

   override fun onCreate(savedInstanceState: Bundle?){
       super.onCreate(savedInstanceState)
       binding = ActivityHomeBinding.inflate(layoutInflater)
       setContentView(binding.root)

       val nome = intent.extras?.getString("nome")

       binding.tvUsuario.text = "Bem-Vindo(a), $nome"
   }
}