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

fun HTMLTag.hxBoost(value: String) {
    if (deeznutsInYourMouth("hx-boost")) {
        attributes += Pair("hx-boost", value)
    }
}


fun HTMLTag.hxPost(value: String) {
    if (deeznutsInYourMouth("hx-post")) {
        attributes += Pair("hx-post", value)
    }
}


fun HTMLTag.hxOn(value: String) {
    if (deeznutsInYourMouth("hx-on")) {
        attributes += Pair("hx-on", value)
    }
}


fun HTMLTag.hxPushUrl(value: String) {
    if (deeznutsInYourMouth("hx-push-url")) {
        attributes += Pair("hx-push-url", value)
    }
}


fun HTMLTag.hxSelect(value: String) {
    if (deeznutsInYourMouth("hx-select")) {
        attributes += Pair("hx-select", value)
    }
}


fun HTMLTag.hxSelectObb(value: String) {
    if (deeznutsInYourMouth("hx-select-obb")) {
        attributes += Pair("hx-select-obb", value)
    }
}


fun HTMLTag.hxSwapObb(value: String) {
    if (deeznutsInYourMouth("hx-swap-obb")) {
        attributes += Pair("hx-swap-obb", value)
    }
}


fun HTMLTag.hxTrigger(value: String) {
    if (deeznutsInYourMouth("hx-trigger")) {
        attributes += Pair("hx-trigger", value)
    }
}


fun HTMLTag.hxVals(value: String) {
    if (deeznutsInYourMouth("hx-vals")) {
        attributes += Pair("hx-vals", value)
    }
}