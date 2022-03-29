package br.com.dio.dadosentreactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import br.com.dio.dadosentreactivity.databinding.ActivityMainBinding
import br.com.dio.dadosentreactivity.databinding.ActivitySegundaBinding


class SegundaActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperarDados()

        binding.btnProsseguir.setOnClickListener{prosseguir()}

    }
    // Criando um metódo para recuperar dados
    private fun recuperarDados() {
        val usuario = intent.getSerializableExtra("nome") as Usuario

        binding.editNome.setText(usuario.nome)
    }
        private fun prosseguir(){
            val nome = binding.editNome.text.toString()
            val email = binding.editEmail.text.toString()

            val usuario = Usuario(nome,email)

            val intent = Intent(this,TerceiraActivity::class.java)
            intent.putExtra("nome", nome)
            startActivity(intent)

        }
}
