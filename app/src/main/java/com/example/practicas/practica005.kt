package com.example.practicas

fun main(parametro: Array<String>)  {
    println("Ingresa el dia de la Semana")
    val diaSemana = readln().toInt()

    when (diaSemana) {
        1-> println("Lunes")
        2-> println("Martes")
        3-> println("Miercoles")
        4-> println("Jueves")
        5-> println("Viernes")
        else -> println("Fin de Semana")
    }

}