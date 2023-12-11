package mykotlinplayground.array

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ArrayTest {

    @Nested
    @DisplayName("Two Sum")
    inner class TwoSumTest {
        @Test
        fun `two sum will return a list of two elements`() {
            // Arrange
            val nums: IntArray = intArrayOf(2, 7, 11, 5)
            val target = 9
            // Act
            val result = twoSum(nums, target)
            // Assert
            assertTrue(message = "Array size is not two") {
                result.size == 2
            }
        }
        
        @Test
        fun `two sum using map will return a index of result`() {
            // Arrange
            val nums: IntArray = intArrayOf(2, 11, 5, 7)
            val target = 9
            // Act
            val result = twoSumUsingMap(nums, target)
            // Assert
            assertTrue(message = "Index of result is wrong") {
                result.isNotEmpty() && result[0] == 0 && result[1] == 3
            }
        }

        @Test
        fun `two sum will return a index of result`() {
            // Arrange
            val nums: IntArray = intArrayOf(2, 11, 5, 7)
            val target = 9
            // Act
            val result = twoSum(nums, target)
            // Assert
            assertTrue(message = "Index of result is wrong") {
                result.isNotEmpty() && result[0] == 0 && result[1] == 3
            }
        }

        @Test
        fun `for invalid input result should be empty array`() {
            // Arrange
            val nums: IntArray = intArrayOf(2, 11, 5, 1)
            val target = 9
            // Act
            val result = twoSum(nums, target)
            // Assert
            assertTrue(message = "Array should be empty") {
                result.isEmpty()
            }
        }

        @Test
        fun `for empty input list result should be empty array`() {
            // Arrange
            val nums: IntArray = intArrayOf()
            val target = 9
            // Act
            val result = twoSum(nums, target)
            // Assert
            assertTrue(message = "Array should be empty") {
                result.isEmpty()
            }
        }

        @Test
        fun `for duplicate elements in the list index should be different`() {
            // Arrange
            val nums: IntArray = intArrayOf(2, 5, 5, 1)
            val target = 10
            // Act
            val result = twoSum(nums, target)
            // Assert
            assertTrue(message = "Index of result is wrong or both the index are same") {
                result[0] == 1 && result[1] == 2
            }
        }
    }

}

