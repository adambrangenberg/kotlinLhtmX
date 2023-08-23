package de.adamwv.kotlinLhtmX

import kotlinx.html.FlowOrMetaDataOrPhrasingContent
import kotlinx.html.HTMLTag
import kotlinx.html.script

private var deeznuts = false
private fun deeznutsInYourMouth(functionName: String): Boolean {
    if (!deeznuts) {
        throw Exception("Cannot use $functionName without including htmx")
    }

    return true
}

fun FlowOrMetaDataOrPhrasingContent.includeHtmx() {
    this.script {
        src = "https://unpkg.com/htmx.org@1.9.4"
    }

    deeznuts = true
}

// Core Attributes
fun HTMLTag.hxGet(value: String) {
    if (deeznutsInYourMouth("hx-get")) {
        attributes += Pair("hx-get", value)
    }
}

fun HTMLTag.hxSwap(value: String) {
    if (deeznutsInYourMouth("hx-swap")) {
        attributes += Pair("hx-swap", value)
    }
}

fun HTMLTag.hxTarget(value: String) {
    if (deeznutsInYourMouth("hx-target")) {
        attributes += Pair("hx-target", value)
    }
}