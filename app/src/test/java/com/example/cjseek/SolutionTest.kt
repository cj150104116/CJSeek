package com.example.cjseek

import com.example.cjseek.leetcode.ListNode
import com.example.cjseek.leetcode.Solution
import org.junit.Test

/**
 * @author chenjun
 * 创建日期：2021/8/12
 */
class SolutionTest {
    @Test
    fun twoSum_isCorrect() {
        val node1 = ListNode(2)
        val node2 = ListNode(3)
        val node3 = ListNode(4)

        node1.next = node2
        node2.next = node3
        val reverseList = Solution().reverseList(node1)
        print("${reverseList?.value}:${reverseList?.next?.value}:${reverseList?.next?.next?.value}")
    }
}