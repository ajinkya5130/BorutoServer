package com.example.plugins

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*


fun Application.confStatusPages() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) {
            call.respond(
                message = "Page not found",
                status = HttpStatusCode.NotFound
            )
        }
        //Below code is just for learning purpose -
        /* exception<AuthenticationException> {
             call.respond(message = "Unknown exception", status = HttpStatusCode.OK)
         }*/
    }
}