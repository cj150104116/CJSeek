package com.example.cjseek.leetcode

fun quickSort(array: IntArray, leftIndex: Int, rightIndex: Int) {
    if (leftIndex < rightIndex) {
        val pivotIndex = partition(array, leftIndex, rightIndex)
        quickSort(array, leftIndex, pivotIndex - 1)
        quickSort(array, pivotIndex + 1, rightIndex)
    }
    println(array.contentToString())
}

private fun partition(array: IntArray, leftIndex: Int, rightIndex: Int): Int {
    
    var left = leftIndex
    var right = rightIndex
    val pivotValue = array[left]
    while (left < right) {
        while (left < right && array[right] >= pivotValue) {
            right--
        }
        array[left] = array[right]

        while (left < right && array[left] <= pivotValue) {
            left++
        }
        array[right] = array[left]
    }
    array[left] = pivotValue
    return left
}