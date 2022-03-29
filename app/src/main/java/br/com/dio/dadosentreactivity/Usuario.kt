package br.com.dio.dadosentreactivity

import java.io.Serializable

data class Usuario(
    var nome: String,
    var email: String?  = ""
):Serializable