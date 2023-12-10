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
        fun `two sum will return a index of result`() {
            // Arrange
            val nums: IntArray = intArrayOf(2, 11, 5, 7)
            val target = 9
            // Act
            val result = twoSum(nums, target)
            // Assert
            assertTrue(message = "Index of result is wrong") {
                result[0] == 0 && result[1] == 3
            }
        }
    }

}

