package org.example.Tema1

fun main(){
    println("Iniciando proceso...")
    //val process = ProcessBuilder("cmd","/c","timeout", "2").start()
    val process = ProcessBuilder("ping", "-n", "2", "127.0.0.1").start()
    process.waitFor()
    println("Proceso finalizado.")
}