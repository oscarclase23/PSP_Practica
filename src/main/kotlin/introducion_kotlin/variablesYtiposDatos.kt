package org.example.introducion_kotlin

fun main(){
    val nombre: String = "Juan"
    val edad = 25
    val altura = 1.75
    val esEstudiante: Boolean = true

    var saldo: Double = 1000.0
    var intentos = 0

    val edadString = edad.toString()
    val  alturaInt = altura.toInt()

    println("Nombre: $nombre")
    println("Edad: $edad años")
    println("Altura: $altura metros")
    println("Es estudiante: $esEstudiante")
    println("Saldo actual: $saldo€")

    saldo = saldo - 50.0
    intentos++

    println("Nuevo saldo: $saldo€")
    println("Intentos realizados: $intentos")

}