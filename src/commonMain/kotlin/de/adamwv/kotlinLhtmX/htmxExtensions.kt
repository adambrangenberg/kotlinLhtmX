package de.adamwv.kotlinLhtmX

import kotlinx.html.FlowOrMetaDataOrPhrasingContent
import kotlinx.html.HTMLTag
import kotlinx.html.script

private var deeznuts = false
private fun deeznutsInYourMouth(functionName: String): Boolean {
    if (!deeznuts) {
        throw Exception(
            "Cannot use $functionName without including htmx. Use the includeHtmx function inside head to do so.")
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

// Additional Attributes
fun HTMLTag.hxConfirm(value: String) {
    if (deeznutsInYourMouth("hx-confirm")) {
        attributes += Pair("hx-confirm", value)
    }
}

fun HTMLTag.hxDelete(value: String) {
    if (deeznutsInYourMouth("hx-delete")) {
        attributes += Pair("hx-delete", value)
    }
}

fun HTMLTag.hxDisable(value: String) {
    if (deeznutsInYourMouth("hx-disable")) {
        attributes += Pair("hx-disable", value)
    }
}

fun HTMLTag.hxDisinherit(value: String) {
    if (deeznutsInYourMouth("hx-disinherit")) {
        attributes += Pair("hx-disinherit", value)
    }
}

fun HTMLTag.hxEncoding(value: String) {
    if (deeznutsInYourMouth("hx-encoding")) {
        attributes += Pair("hx-encoding", value)
    }
}

fun HTMLTag.hxExt(value: String) {
    if (deeznutsInYourMouth("hx-ext")) {
        attributes += Pair("hx-ext", value)
    }
}

fun HTMLTag.hxHeaders(value: String) {
    if (deeznutsInYourMouth("hx-headers")) {
        attributes += Pair("hx-headers", value)
    }
}

fun HTMLTag.hxHistory(value: String) {
    if (deeznutsInYourMouth("hx-history")) {
        attributes += Pair("hx-history", value)
    }
}

fun HTMLTag.hxHistoryElt(value: String) {
    if (deeznutsInYourMouth("hx-history-elt")) {
        attributes += Pair("hx-history-elt", value)
    }
}

fun HTMLTag.hxInclude(value: String) {
    if (deeznutsInYourMouth("hx-include")) {
        attributes += Pair("hx-include", value)
    }
}

fun HTMLTag.hxIndicator(value: String) {
    if (deeznutsInYourMouth("hx-indicator")) {
        attributes += Pair("hx-indicator", value)
    }
}

fun HTMLTag.hxParams(value: String) {
    if (deeznutsInYourMouth("hx-params")) {
        attributes += Pair("hx-params", value)
    }
}

fun HTMLTag.hxPatch(value: String) {
    if (deeznutsInYourMouth("hx-patch")) {
        attributes += Pair("hx-patch", value)
    }
}

fun HTMLTag.hxPreserve(value: String) {
    if (deeznutsInYourMouth("hx-preserve")) {
        attributes += Pair("hx-preserve", value)
    }
}

fun HTMLTag.hxPrompts(value: String) {
    if (deeznutsInYourMouth("hx-prompt")) {
        attributes += Pair("hx-prompt", value)
    }
}

fun HTMLTag.hxPut(value: String) {
    if (deeznutsInYourMouth("hx-put")) {
        attributes += Pair("hx-put", value)
    }
}

fun HTMLTag.hxReplaceUrl(value: String) {
    if (deeznutsInYourMouth("hx-replace-url")) {
        attributes += Pair("hx-replace-url", value)
    }
}

fun HTMLTag.hxRequest(value: String) {
    if (deeznutsInYourMouth("hx-request")) {
        attributes += Pair("hx-request", value)
    }
}

fun HTMLTag.hxSse(value: String) {
    if (deeznutsInYourMouth("hx-sse")) {
        attributes += Pair("hx-sse", value)
    }
}

fun HTMLTag.hxSync(value: String) {
    if (deeznutsInYourMouth("hx-sync")) {
        attributes += Pair("hx-sync", value)
    }
}

fun HTMLTag.hxValidate(value: String) {
    if (deeznutsInYourMouth("hx-validate")) {
        attributes += Pair("hx-validate", value)
    }
}

@Deprecated("Please use hxVals(String): Unit instead")
fun HTMLTag.hxVars(value: String) {
    if (deeznutsInYourMouth("hx-vars")) {
        attributes += Pair("hx-vars", value)
    }
}

fun HTMLTag.hxWs(value: String) {
    if (deeznutsInYourMouth("hx-ws")) {
        attributes += Pair("hx-ws", value)
    }
}