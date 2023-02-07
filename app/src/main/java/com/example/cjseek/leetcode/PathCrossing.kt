package com.example.cjseek.leetcode


data class Point(val x: Int, val y: Int)

/**
 * https://leetcode.cn/problems/path-crossing/
 * 'N'、'S'、'E' 或者 'W'，分别表示向北、向南、向东、向西
 *
 * 用hashset提升效率
 */
fun isPathCrossing(path: String): Boolean {

    val points = linkedSetOf<Point>()
    points.add(Point(0, 0))

    for (char in path.toCharArray()) {
        when (char) {
            'N' -> {
                val lastPoint = points.last()
                val newPoint = lastPoint.copy(x = lastPoint.x, y = lastPoint.y + 1)
                if (points.contains(newPoint)) {
                    return true
                }
                points.add(newPoint)
            }
            'S' -> {
                val last = points.last()
                val newPoint = last.copy(x = last.x, y = last.y - 1)
                if (points.contains(newPoint)) {
                    return true
                }
                points.add(newPoint)
            }
            'E' -> {
                val last = points.last()
                val newPoint = last.copy(x = last.x + 1, y = last.y)
                if (points.contains(newPoint)) {
                    return true
                }
                points.add(newPoint)
            }
            'W' -> {
                val last = points.last()
                val newPoint = last.copy(x = last.x - 1, y = last.y)
                if (points.contains(newPoint)) {
                    return true
                }
                points.add(newPoint)
            }
        }
    }
    return false
}

