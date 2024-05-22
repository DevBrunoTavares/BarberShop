package com.example.barbershop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barbershop.databinding.ActivityMainBinding
import com.example.barbershop.view.Home
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edtNome = binding.edtNome

        binding.btnAgendar.setOnClickListener {
            val agendar = binding.edtNome.text.toString()


            if (agendar == "") {
                // mostrar  mensagem para o usuario

                Snackbar.make(
                    edtNome, "Preencha seu nome",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            } else {
                navegarPraHome(agendar)
            }
        }
    }

    private fun navegarPraHome(agendar: String) {
        val intent = Intent(this, Home::class.java)
        intent.putExtra("Agendar", agendar)
        startActivity(intent)
    }
}