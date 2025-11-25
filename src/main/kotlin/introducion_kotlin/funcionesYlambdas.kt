package org.example.introducion_kotlin

    fun main(){
        val num1 = 10.0
        val num2 = 3.0

        // Usando lambdas
        val suma = calculadora(num1,num2) {x,y -> x+y}
        val resta = calculadora(num1,num2) {x,y -> x-y}
        val multiplicacion = calculadora(num1,num2) {x,y -> x*y}
        val division = calculadora(num1,num2) {x,y -> if(y != 0.0) x/y else 0.0}

        println("$num1 + $num2 = $suma")
        println("$num1 - $num2 = $resta")
        println("$num1 × $num2 = $multiplicacion")
        println("$num1 ÷ $num2 = $division")

        // Aplicar operaciones a una lista
        val numeros = listOf(1.0, 2.0, 3.0, 4.0, 5.0)
        val cuadrados = aplicarOperaciones(numeros) {it*it}
        val dobles = aplicarOperaciones(numeros) {it*2}

        println("Números originales: $numeros")
        println("Cuadrados: $cuadrados")
        println("Dobles: $dobles")
    }

    fun calculadora (a: Double,b: Double, operacion:(Double,Double) -> Double): Double{
        return operacion(a,b)
    }

    fun aplicarOperaciones(numeros: List<Double>,operacion: (Double) -> Double): List<Double>{
        return numeros.map(operacion)
    }

