package land.mog.superfine.example

import land.mog.superfine.h
import land.mog.superfine.patch
import kotlin.browser.document
import kotlin.browser.window
import kotlin.js.json

fun main() {
    val viewBefore = h("div", json(), arrayOf(
        h("h1", json(), arrayOf("View Before")),
        h("p", json(
            "style" to "color: red;"
        ), arrayOf("RED"))
    ))
    val viewAfter = h("div", json(), arrayOf(
        h("h1", json(), arrayOf("View After")),
        h("p", json(
            "style" to "color: blue;"
        ), arrayOf("BLUE"))
    ))
    
    val root = document.getElementById("root")!!
    
    patch(root, viewBefore)
    
    window.setTimeout({
        patch(root, viewAfter)
    }, 1000)
    
    
}
