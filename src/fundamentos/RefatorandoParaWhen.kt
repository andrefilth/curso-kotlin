/*
 * @(#)RefatorandoParaWhen.kt 1.0 29/08/2019
 * @autor: André Franco
 *
 * Copyright (c) 2019, PicPay S.A. All rights reserved.
 * PicPay S.A. proprietary/confidential. Use is subject to license terms.
 */

package fundamentos

fun main(args: Array<String>) {
    val nota = -1

    when(nota){
        10,9 -> println("Fantástico")
        8,7 -> println("Parabéns")
        6,5,4 -> println("Tem como recuperar")
        in 0..3 -> println("Te vejo no próximo semestre")
        else -> println(" Nota inválida")
    }
}