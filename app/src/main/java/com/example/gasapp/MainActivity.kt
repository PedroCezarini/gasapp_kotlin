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

    fun btnGravar() {
        try {
            val distancia = binding.editDistancia.text.toString().toFloat()
            val preco = binding.editPreco.text.toString().toFloat()
            val autonomia = binding.editAutonomia.text.toString().toFloat()

            if (autonomia == 0f) {
                binding.textResposta.text = "A autonomia deve ser maior que zero."
                return
            }

            val gasto = (distancia / autonomia) * preco
            binding.textResposta.text = "Gasto total: R$ %.2f".format(gasto)
        } catch (e: Exception) {
            binding.textResposta.text = "Preencha todos os campos corretamente."
        }
    }
}