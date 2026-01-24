package leetcode.p539

import kotlin.math.abs
import kotlin.math.min

/**
 * Given a list of 24-hour clock time points in "HH:MM" format,
 * return the minimum minutes difference between any two time-points in the list.
 *
 *
 * Example 1:
 *
 * Input: timePoints = ["23:59","00:00"]
 * Output: 1
 * Example 2:
 *
 * Input: timePoints = ["00:00","23:59","00:00"]
 * Output: 0
 *
 *
 * Constraints:
 *
 * 2 <= timePoints.length <= 2 * 104
 * timePoints[i] is in the format "HH:MM".
 */
class Solution {
    fun findMinDifference(timePoints: List<String>): Int {
        var minDiff = Int.MAX_VALUE
        for (i in timePoints.indices) {
            val time1 = timePoints[i].split(":").map { it.toInt() }
            val minutes1 = time1[0] * 60 + time1[1]

            for (j in i + 1 until timePoints.size) {
                val time2 = timePoints[j].split(":").map { it.toInt() }
                val minutes2 = time2[0] * 60 + time2[1]

                var diff = abs(minutes1 - minutes2)
                if (diff > 720) {
                    diff = 1440 - diff // Adjust for circular clock
                }

                if (diff == 0) return 0 // Early exit if we find a zero difference

                minDiff = min(minDiff, diff)
            }
        }
        return minDiff
    }
}

fun main() {
    val solution = Solution()
    val timePoints1 = listOf("23:59", "00:00")
    println(solution.findMinDifference(timePoints1)) // Output: 1

    val timePoints2 = listOf("00:00", "23:59", "00:00")
    println(solution.findMinDifference(timePoints2)) // Output: 0
}