@file:JsModule("superfine")

package land.mog.superfine

import org.w3c.dom.Node

external fun h(nodeName: String, props: dynamic, children: Array<dynamic>): VNode

external fun patch(node: Node, vdom: VNode): Node
