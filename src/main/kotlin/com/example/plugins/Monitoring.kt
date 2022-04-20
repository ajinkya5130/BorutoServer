package com.example.plugins

import io.ktor.application.*
import io.ktor.features.*

fun Application.configureMonitoring() {
    install(CallLogging) {
        /*  level = Level.INFO
          filter { call -> call.request.path().startsWith("/") }*/
    }

}
