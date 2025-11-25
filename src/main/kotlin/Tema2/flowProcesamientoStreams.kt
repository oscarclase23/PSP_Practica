package org.example.Tema2

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking


fun main() = runBlocking{
    println("Procesando numeros del 1 al 100...")
    (1..100).asFlow()
        .onEach { delay(100) }
        .filter {
            println("Filtrando pares: $it")
            it % 2 == 0}
        .map {
            println("Elevando al cuadrado: $it")
            it * it}
        .take(10)
        .collect {
            println("Resultado: $it")
        }
    println("Procesamiento completado.")
}