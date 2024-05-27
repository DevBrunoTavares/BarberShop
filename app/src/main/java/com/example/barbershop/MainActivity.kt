package com.example.barbershop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.barbershop.R.id.tv_usuario
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
            val nome = binding.edtNome.text.toString()


            if (nome == "") {
                // mostrar  mensagem para o usuario

                Snackbar.make(
                    edtNome, "Preencha seu nome",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            } else {
                navegarPraHome(nome)
            }
        }
    }

    private fun navegarPraHome(nome: String) {
        val intent = Intent(this,Home::class.java)
        intent.putExtra("nome", nome)
        startActivity(intent)
    }
}