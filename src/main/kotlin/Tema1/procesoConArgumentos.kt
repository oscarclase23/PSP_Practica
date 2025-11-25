package org.example.Tema1

import java.io.BufferedReader

fun main() {
    val process = ProcessBuilder("cmd","/c","dir","C:\\","/q").start()
    val reader = process.inputStream.bufferedReader()

    var linea = reader.readLine()


    while (linea != null){
        println(linea)
        linea = reader.readLine()
    }

    process.waitFor()
}