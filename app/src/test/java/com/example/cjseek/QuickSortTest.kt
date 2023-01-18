package com.example.cjseek

import com.example.cjseek.leetcode.quickSort
import org.junit.Test

class QuickSortTest {
    @Test
    fun quickSort_isCorrect() {
        val array = intArrayOf(2, 6, 9, 1, 10, 2, 43, 5, 88, 54, 76, 9, 6)
        quickSort(array, 0, array.size - 1)
    }
}