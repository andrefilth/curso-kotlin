package fundamentos

import fundamentos.pacoteA.simples as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>) {
    kotlin.io.println(funcaoSimples("OK"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println("Enum")
    println(CARA)

    // podemos usar uma função dentro de um template
    println("${soma(2,3)} ${subtracao(3, 2)}")
}