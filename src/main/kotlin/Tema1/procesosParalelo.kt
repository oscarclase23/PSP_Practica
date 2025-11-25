package org.example.Tema1

import kotlin.concurrent.thread

fun main() {
    val comandos= listOf("1","2","3")

    val hilos = comandos.map { segundos ->
        thread {
            println("Ejecutando sleep: $segundos segundo")
            val process = ProcessBuilder("powershell","sleep",segundos).start()
            process.waitFor()
            println("Terminado $segundos")
        }
    }
    hilos.forEach { it.join() }
}