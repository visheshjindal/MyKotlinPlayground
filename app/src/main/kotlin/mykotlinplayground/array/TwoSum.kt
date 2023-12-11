package mykotlinplayground.array

import kotlin.math.abs


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

fun twoSum(nums: IntArray, target: Int) : IntArray {
    for(i in nums.indices) {
        for (j in i+1..<nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}

fun twoSumUsingMap(nums: IntArray, target: Int) : IntArray {
    val map = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        val diff = target - nums[i]
        if (map.containsKey(diff)) {
            return intArrayOf(map.getOrDefault(diff, diff), i)
        } else {
            map[nums[i]] = i
        }
    }
    return intArrayOf()
}