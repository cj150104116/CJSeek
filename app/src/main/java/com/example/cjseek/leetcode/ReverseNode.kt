package com.example.cjseek.leetcode

import java.util.*

data class Node(val value: Int, var next: Node?) {
    override fun toString(): String {
        val stringBuilder = StringBuilder()
        var currentNode: Node? = this
        while (currentNode != null) {
            if (currentNode.next == null) {
                stringBuilder.append("${currentNode.value}")
            } else {
                stringBuilder.append("${currentNode.value},")
            }
            currentNode = currentNode.next
        }
        return stringBuilder.toString()
    }
}

fun reverseNode(node: Node): Node {
    var preNode: Node? = null
    var currentNode: Node? = node
    while (currentNode != null) {
        val tempNode = currentNode.next
        currentNode.next = preNode
        preNode = currentNode
        currentNode = tempNode
    }
    return preNode!!
}

fun main() {
    val task = Task()
    val taskThread1 = Thread { task.updateCount() }
    val taskThread2 = Thread { task.updateCount() }

    taskThread1.start()
    taskThread2.start()
    taskThread1.join()
    taskThread2.join()
    println(task.getCount())
}

public class Task {
    private var count: Int = 0
    fun updateCount() {
        for (i in 0..999) {
            synchronized(this) {
                count++
            }
        }
    }

    fun getCount(): Int {
        return count
    }
}