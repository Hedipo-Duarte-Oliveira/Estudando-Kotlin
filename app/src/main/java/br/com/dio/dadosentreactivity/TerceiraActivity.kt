package br.com.dio.dadosentreactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dio.dadosentreactivity.databinding.ActivityTerceiraBinding

class TerceiraActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTerceiraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTerceiraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperaDados()
    }

    private fun recuperaDados(){
        val usuario = intent.getSerializableExtra("nome") as Usuario

        binding.textNome.text = usuario.nome
        binding.textEmail.text = usuario.email
    }
}