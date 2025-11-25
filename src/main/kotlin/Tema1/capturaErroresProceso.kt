package org.example.Tema1


fun main() {
    // PREPARAMOS UN PROCESO PARA EJECUTAR UN COMANDO

     val pb = ProcessBuilder("powerShell","comadofallido")
    //val pb = ProcessBuilder("cmd","/c","dir")
    //val pb = ProcessBuilder("cmd.exe", "/c", "echo ¡Mensaje CORRECTO! & type archivo_que_no_existe.txt")


    // SEPARACIÓN DE CANALES
    pb.redirectErrorStream(false)

    // EJECUCIÓN
    val process = pb.start()

    // CAPTURAR LA SALIDA ESTÁNDAR (LO BUENO)
    val readerSalida = process.inputStream.bufferedReader()


    // CAPTURAR LA SALIDA DE ERROR
    val readerError = process.errorStream.bufferedReader()

    // IMPRIMIR SALIDA ESTÁNDAR
    println("Salida estándar:")
    var lineas = readerSalida.readLine()

    while(lineas != null){
        println(lineas)
        lineas = readerSalida.readLine()
    }

    // IMPRIMIR SALIDA DE ERROR
    println("Salida de error:")
    var lineasError = readerError.readLine()

    while(lineasError != null){
        println(lineasError)
        lineasError = readerError.readLine()
    }
}