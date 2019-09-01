/*
 * @(#)While.kt 1.0 29/08/2019
 * @autor: André Franco
 *
 * Copyright (c) 2019, PicPay S.A. All rights reserved.
 * PicPay S.A. proprietary/confidential. Use is subject to license terms.
 */

package fundamentos.controle

fun main() {
    var opcao: Int = 0
    while (opcao != -1){
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Você escolheu a opção: $opcao")

    }
    println("Até a próxima")
}