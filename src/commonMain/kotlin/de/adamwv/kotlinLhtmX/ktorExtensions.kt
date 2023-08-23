package de.adamwv.kotlinLhtmX

import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.utils.io.charsets.*
import kotlinx.html.BODY
import kotlinx.html.body
import kotlinx.html.consumers.filter
import kotlinx.html.stream.createHTML

suspend fun ApplicationCall.respondHTMX(status: HttpStatusCode = HttpStatusCode.OK, block: BODY.() -> Unit) {
    val text = createHTML(true).filter {
        if (it.tagName == "body") SKIP else PASS
    }.body(block = block)


    if (text.isEmpty()) {
        throw Exception("Provided HTML was empty")
    }

    respond(TextContent(text, ContentType.Text.Html.withCharset(Charsets.UTF_8), status))
}