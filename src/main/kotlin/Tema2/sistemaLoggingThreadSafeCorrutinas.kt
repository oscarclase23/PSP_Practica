package org.example.Tema2

import kotlinx.coroutines.channels.Channel
import java.time.LocalDateTime

data class LogEvent(
    //val level: String,
    val message: String,
    val corroutineName: String,
    val timeStamp: LocalDateTime = LocalDateTime.now()
)

class Logger{
    val chanel = Channel<LogEvent>()

}


