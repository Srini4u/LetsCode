package org.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSomeSampleTest {

    @Test
    public void validateTwoSum(){
        int[] inputArray = {1,3,7,4};
        int target = 10;
        int[] resultArray = TwoSum.findIndicesTwoSum(inputArray, target);

        //validate positive scenario
        assertNotNull(resultArray);
        assertEquals(1, resultArray[0]); //index of 3 is 1
        assertEquals(2, resultArray[1]); //index of 7 is 3
    }

    @Test
    public void validateTwoSumNoResult(){
        int[] inputArray = {1, 3, 4, 9};
        int target = 8;
        int[] resultArray = TwoSum.findIndicesTwoSum(inputArray, target);

        //since no result expect a not null array with no data
        assertNotNull(resultArray);
        assertEquals(0, resultArray.length);
    }

    @Test
    public void validateTwoSomeWithNegativeValues(){
        int[] inputArray = {-3, 1, 2, 12};
        int target = 9;
        int[] resultArray = TwoSum.findIndicesTwoSum(inputArray, target);

        assertNotNull(resultArray);
        assertEquals(0, resultArray[0]);
        assertEquals(3, resultArray[1]);
    }

    @Test
    public void testTwoSumSameElementCannotBeUsedTwice() {
        // Test case where the same element appears only once and cannot be used twice
        int[] nums = {1, 2, 3, 6};
        int target = 6;

        int[] result = TwoSum.findIndicesTwoSum(nums, target);

        // Expecting no result since we can't use the same element twice (3 + 3 is not allowed with a single 3)
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testTwoSumSingleElement() {
        // Test case where the same element appears only once and cannot be used twice
        int[] nums = {6};
        int target = 6;

        int[] result = TwoSum.findIndicesTwoSum(nums, target);

        // Since only one element is present, there can be no valid pair
        assertNotNull(result);
        assertEquals(0, result.length);
    }
}
