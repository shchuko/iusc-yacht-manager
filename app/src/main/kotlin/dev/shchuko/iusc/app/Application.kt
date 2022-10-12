package dev.shchuko.iusc.app

import dev.shchuko.iusc.app.plugins.configureHTTP
import dev.shchuko.iusc.app.plugins.configureRouting
import dev.shchuko.iusc.app.plugins.configureSecurity
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSecurity()
        configureHTTP()
        configureRouting()
    }.start(wait = true)
}
