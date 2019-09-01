/*
 * @(#)IfElseIf.kt 1.0 29/08/2019
 * @autor André Franco
 * Copyright (c) 2019, PicPay S.A. All rights reserved.
 * PicPay S.A. proprietary/confidential. Use is subject to license terms.
 */

package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 3.3
    // usando operador range
    if (nota in 9..10){
        println("Fantástico")
    }else if (nota in 7..8){
        println("Parabéns")
    } else if (nota in 4..6){
        println("Tem como recuperar")
    }else if(nota in 0..3){
        println("Te vejo no próximo semestre")
    }else{
        println("Nota inválida")
    }

}