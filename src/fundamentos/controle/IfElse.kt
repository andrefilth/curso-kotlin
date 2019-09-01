/*
 * @(#)IfElse.kt 1.0 28/08/2019
 *
 * Copyright (c) 2019, PicPay S.A. All rights reserved.
 * PicPay S.A. proprietary/confidential. Use is subject to license terms.
 */

package fundamentos.controle

fun main() {
    val num1: Int = 7
    val num2: Int = 3

    val maiorValor = if (num1 > num2) {
        println("Processando valor do if")
        num1
    }else{
        println("Processando valor do else")
        num2
    }
    println("O maior valor é $maiorValor")

    // pode ser também

    val maiorValor2 = if (num1 > num2) num1 else num2

    println("O maior valor2 é $maiorValor2")

}