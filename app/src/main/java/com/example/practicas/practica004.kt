package com.example.practicas

fun main(parametro: Array<String>) {
    println("Ingresa tu peso:")
    val peso = readln().toDouble()  // Peso en kilogramos
    println("Ingresa tu Altura:")
    val altura = readln().toDouble() // Altura en metros

    //Cálculo del IMC
    val imc = (peso / (altura * altura))

    println("tu masa muscular es "+ imc)

    if (imc < 18.5)  {
        println("Bajo de peso") }

    else if (imc > 18.6 && imc  <= 29.9 ){
        println("Peso normal")
    }
    else println("Estas en sobrepeso")
}
