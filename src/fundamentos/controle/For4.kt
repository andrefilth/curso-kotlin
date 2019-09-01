/*
 * @(#)For4.kt 1.0 30/08/2019
 * @autor: André Franco
 *
 * Copyright (c) 2019, PicPay S.A. All rights reserved.
 * PicPay S.A. proprietary/confidential. Use is subject to license terms.
 */

package fundamentos.controle

fun main() {
    val aluno = arrayListOf("André", "Carla", "Marcos")
    for ((indice, aluno) in aluno.withIndex()){
        println("${indice + 1} - $aluno")
    }
}