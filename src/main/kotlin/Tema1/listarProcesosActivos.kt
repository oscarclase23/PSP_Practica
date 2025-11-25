package org.example.Tema1

import java.io.BufferedReader

fun main() {
    val process = ProcessBuilder("tasklist").start()
    val reader = process.inputStream.bufferedReader()

    var linea = reader.readLine()

    while (linea != null){
        println(linea)
        linea = reader.readLine()
    }


    //reader.lines().forEach { println(it) }
}