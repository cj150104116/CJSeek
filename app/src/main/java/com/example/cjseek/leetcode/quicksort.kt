package com.example.cjseek.leetcode

/**
 * https://blog.csdn.net/zhuxian1277/article/details/112466047
 */
fun quickSort(array: IntArray, leftIndex: Int, rightIndex: Int) {
    if (leftIndex < rightIndex) {
        val pivotIndex = partition(array, leftIndex, rightIndex)
        quickSort(array, leftIndex, pivotIndex - 1)
        quickSort(array, pivotIndex + 1, rightIndex)
    }
}

private fun partition(array: IntArray, leftIndex: Int, rightIndex: Int): Int {
    var left = leftIndex
    var right = rightIndex
    val leftValue = array[left]

    while (left < right) {
        while (left < right && array[right] >= leftValue) {
            right--
        }
        array[left] = array[right]

        while (left < right && array[left] <= leftValue) {
            left++
        }
        array[right] = array[left]
    }
    array[left] = leftValue
    println(array.contentToString())
    return left
}