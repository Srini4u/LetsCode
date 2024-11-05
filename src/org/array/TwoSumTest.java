package org.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void testTwoSumFound() {
        // Test case where two numbers exist that add up to the target
        int[] nums = {1, 3, 5, 7, 9};
        int target = 12;

        int[] result = TwoSum.findIndicesTwoSum(nums, target);

        // Check that the result contains the correct indices (1 and 4 in this case)
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(1, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    public void testTwoSumNotFound() {
        // Test case where no two numbers add up to the target
        int[] nums = {1, 2, 3, 4};
        int target = 10;

        int[] result = TwoSum.findIndicesTwoSum(nums, target);

        // Since no solution exists, we expect an empty array
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testTwoSumWithNegativeNumbers() {
        // Test case where the array contains negative numbers
        int[] nums = {-3, 2, 4, 8};
        int target = 5;

        int[] result = TwoSum.findIndicesTwoSum(nums, target);

        // Check that the correct indices are returned
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(0, result[0]); // -3 is at index 0
        assertEquals(3, result[1]); // 8 is at index 3
    }

    @Test
    public void testTwoSumSameElementUsedTwice() {
        // Test case where the same element cannot be used twice
        int[] nums = {1, 3, 3, 4};
        int target = 6;

        int[] result = TwoSum.findIndicesTwoSum(nums, target);

        // Expecting no result since we can't use the same element twice (3 + 3 is invalid)
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testTwoSumSingleElement() {
        // Test case where the array has only one element, hence no valid solution
        int[] nums = {5};
        int target = 5;

        int[] result = TwoSum.findIndicesTwoSum(nums, target);

        // Since only one element is present, there can be no valid pair
        assertNotNull(result);
        assertEquals(0, result.length);
    }
}
