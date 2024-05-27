package com.example.barbershop.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.barbershop.R
import com.example.barbershop.adapter.ServicosAdapter
import com.example.barbershop.databinding.ActivityHomeBinding
import com.example.barbershop.databinding.ActivityMainBinding
import com.example.barbershop.model.Servicos

class Home : AppCompatActivity() {
   private lateinit var binding: ActivityHomeBinding
   private lateinit var servicosAdapter: ServicosAdapter
   private val listaServicos: MutableList<Servicos> = mutableListOf()

   override fun onCreate(savedInstanceState: Bundle?){
       super.onCreate(savedInstanceState)
       binding = ActivityHomeBinding.inflate(layoutInflater)
       setContentView(binding.root)

       val nome = intent.extras?.getString("nome")

       binding.tvUsuario.text = "Bem-Vindo(a), $nome"
       val recyclerViewServicos = binding.root
       recyclerViewServicos.layoutManager =
}