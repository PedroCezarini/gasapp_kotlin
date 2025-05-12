package com.example.gasapp

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gasapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener(this)
    }

    override fun onClick(view: View){
        if( view.id == R.id.button_calcular){
            btnGravar()
        }
    }

    fun btnGravar(){
        val valor1 = binding.valor1.text.toString().toFloat()
        val valor2 = binding.valor2.text.toString().toFloat()
        val valor3 = binding.valor3.text.toString().toFloat()

        binding.textResposta.text = "O botão foi clicado"
    }
}