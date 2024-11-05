package org.array;

import java.util.Arrays;

public class MaximumSubArray {

    public static void main(String[] args){
        int[] inputArray = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubArraySum = maxSubArrayValue(inputArray);
        System.out.println("maxSubArraySum = " + maxSubArraySum);
    }

    private static int maxSubArrayValue(int[] inputArray){
        int arrayLength = inputArray.length;
        int maxSubArray = 0;
        for(int i = 0; i <arrayLength; i++ ){
            int currentSubArray = 0;
            for(int j = i; j < arrayLength; j++){
                currentSubArray += inputArray[j];
                maxSubArray = Math.max(maxSubArray, currentSubArray);
            }
        }
        return maxSubArray;
    }

}
