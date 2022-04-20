package com.example.plugins

import com.example.routes.getAllHeroes
import com.example.routes.root
import com.example.routes.searchHeroes
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()
        confStatusPages()

        static("/images") {
            resources("images")
        }

        //Below code is just for learning purpose -
        /*  get("/text") {
              throw AuthenticationException()
          }*/
    }
}
