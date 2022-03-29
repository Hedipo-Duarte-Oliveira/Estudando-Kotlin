package br.com.dio.dadosentreactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dio.dadosentreactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //evento de click e chamando o metodo criando abaixo.

        binding.btnProsseguir.setOnClickListener{prosseguir()}
    }
    // criando metódo
    private fun prosseguir(){
        val nome = binding.editNome.text.toString()

        val usuario = Usuario(nome)

        // criando uma intençao para abrir uma tela, sair da primeira tela ir para segunda
        val intent = Intent(this,SegundaActivity::class.java)// daonte estou saindo para onde estou indo
        intent.putExtra("usuario", usuario) // passar a chave, e a iformçao passada para segunda activity

        startActivity(intent)//start para ação
    }
}