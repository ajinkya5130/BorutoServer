package com.example.plugins

import com.example.routes.getAllHeroes
import com.example.routes.root
import io.ktor.application.*
import io.ktor.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
    }
}
