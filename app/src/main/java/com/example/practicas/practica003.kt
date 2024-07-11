package com.example.practicas

fun main() {

    val peso = 90.0  // Peso en kilogramos
    val altura = 1.69  // Altura en metros

// Cálculo del IMC
    val imc = (peso / (altura * altura))

    println("tu masa muscular es "+ imc)

    if (imc < 18.5)  {
        println("Bajo de peso") }

    else if (imc > 18.6 && imc  <= 29.9 ){
        println("Peso normal")
    }
    else println("Estas en sobrepeso")
}