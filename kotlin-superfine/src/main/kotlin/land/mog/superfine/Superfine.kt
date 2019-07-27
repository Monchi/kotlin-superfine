package land.mog.superfine

import org.w3c.dom.Node

external interface VNode {
    val name: String
    val props: dynamic
    val children: List<VNode>
    val node: Node?
    val type: Short?
    val key: String?
}
