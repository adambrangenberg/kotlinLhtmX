package de.adamwv.kotlinLhtmX
import kotlinx.html.FlowOrMetaDataOrPhrasingContent
import kotlinx.html.HTMLTag
import kotlinx.html.script

fun FlowOrMetaDataOrPhrasingContent.includeHtmx() {
    this.script {
        src = "https://unpkg.com/htmx.org@1.9.4"
    }
}

// Core Attributes
fun HTMLTag.hxGet(value: String) {
    attributes += Pair("hx-get", value)
}

fun HTMLTag.hxSwap(value: String) {
    attributes += Pair("hx-swap", value)
}

fun HTMLTag.hxTarget(value: String) {
    attributes += Pair("hx-target", value)
}

fun HTMLTag.hxBoost(value: String) {
    attributes += Pair("hx-boost", value)
}

fun HTMLTag.hxPost(value: String) {
    attributes += Pair("hx-post", value)
}

fun HTMLTag.hxOn(value: String) {
    attributes += Pair("hx-on", value)
}

fun HTMLTag.hxPushUrl(value: String) {
    attributes += Pair("hx-push-url", value)
}

fun HTMLTag.hxSelect(value: String) {
    attributes += Pair("hx-select", value)
}

fun HTMLTag.hxSelectObb(value: String) {
    attributes += Pair("hx-select-obb", value)
}

fun HTMLTag.hxSwapObb(value: String) {
    attributes += Pair("hx-swap-obb", value)
}

fun HTMLTag.hxTrigger(value: String) {
    attributes += Pair("hx-trigger", value)
}

fun HTMLTag.hxVals(value: String) {
    attributes += Pair("hx-vals", value)
}

// Additional Attributes
fun HTMLTag.hxConfirm(value: String) {
    attributes += Pair("hx-confirm", value)
}

fun HTMLTag.hxDelete(value: String) {
    attributes += Pair("hx-delete", value)
}

fun HTMLTag.hxDisable(value: String) {
    attributes += Pair("hx-disable", value)
}

fun HTMLTag.hxDisinherit(value: String) {
    attributes += Pair("hx-disinherit", value)
}

fun HTMLTag.hxEncoding(value: String) {
    attributes += Pair("hx-encoding", value)
}

fun HTMLTag.hxExt(value: String) {
    attributes += Pair("hx-ext", value)
}

fun HTMLTag.hxHeaders(value: String) {
    attributes += Pair("hx-headers", value)
}

fun HTMLTag.hxHistory(value: String) {
    attributes += Pair("hx-history", value)
}

fun HTMLTag.hxHistoryElt(value: String) {
    attributes += Pair("hx-history-elt", value)
}

fun HTMLTag.hxInclude(value: String) {
    attributes += Pair("hx-include", value)
}

fun HTMLTag.hxIndicator(value: String) {
    attributes += Pair("hx-indicator", value)
}

fun HTMLTag.hxParams(value: String) {
    attributes += Pair("hx-params", value)
}

fun HTMLTag.hxPatch(value: String) {
    attributes += Pair("hx-patch", value)
}

fun HTMLTag.hxPreserve(value: String) {
    attributes += Pair("hx-preserve", value)
}

fun HTMLTag.hxPrompts(value: String) {
    attributes += Pair("hx-prompt", value)
}

fun HTMLTag.hxPut(value: String) {
    attributes += Pair("hx-put", value)
}

fun HTMLTag.hxReplaceUrl(value: String) {
    attributes += Pair("hx-replace-url", value)
}

fun HTMLTag.hxRequest(value: String) {
    attributes += Pair("hx-request", value)
}

fun HTMLTag.hxSse(value: String) {
    attributes += Pair("hx-sse", value)
}

fun HTMLTag.hxSync(value: String) {
    attributes += Pair("hx-sync", value)
}

fun HTMLTag.hxValidate(value: String) {
    attributes += Pair("hx-validate", value)
}

@Deprecated("Please use hxVals(String): Unit instead", ReplaceWith("hxVals(value)"))
fun HTMLTag.hxVars(value: String) {
    attributes += Pair("hx-vars", value)
}

fun HTMLTag.hxWs(value: String) {
    attributes += Pair("hx-ws", value)
}