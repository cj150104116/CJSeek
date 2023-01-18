package com.example.cjseek

import com.example.cjseek.leetcode.Node
import com.example.cjseek.leetcode.reverseNode
import org.junit.Test

class ReverseNodeTest {
    @Test
    fun reverseNode_isCorrect() {
        val node9 = Node(9, null)
        val node8 = Node(8, node9)
        val node7 = Node(7, node8)
        val node6 = Node(6, node7)
        val node5 = Node(5, node6)
        val node4 = Node(4, node5)
        println(node4.toString())
        val reverseNode = reverseNode(node4)
        println(reverseNode.toString())
    }
}