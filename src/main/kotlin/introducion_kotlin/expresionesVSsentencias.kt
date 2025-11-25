package org.example.introducion_kotlin

fun main(){
    val edades = listOf(5,16,25,70,-1)

    edades.forEach { edad ->
        val categoria = categoriaPersona(edad)
        val descuento = descuentoEntrada(edad)
        println("Edad: $edad -> Categoría: $categoria, Descuento: ${(1-descuento)*100}%")
    }
}

fun categoriaPersona(edad: Int): String{
    return when{
        edad < 0 -> "Edad invalida"
        edad <= 12 -> "Niño"
        edad <= 17 -> "Adolescente"
        edad <= 64 -> "Adulto"
        else ->"Adulto mayor"
    }
}

fun descuentoEntrada(edad: Int): Double{
    return if(edad < 18 || edad >= 65) 0.5 else 1.0

    // Otra forma de hacerlo
    /* return when {
        edad < 18 ||edad >=65 -> 0.5
        else -> 1.0
    }
    */
}

