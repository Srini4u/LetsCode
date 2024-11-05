package org.array;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main (String[] args){

        int[] nums = {1, 2, 3, 4}; //Output: {24, 12, 8, 6}
        //int[] outputArray = bruteForce(nums);
        int[] outputArray = getProductExceptSelf(nums);
        System.out.println("outputArray>> "+ Arrays.toString(outputArray));
    }

    private static int[] bruteForce(int[] inputArray){
        int[] resultArray = new int[4];
        for(int i =0; i < inputArray.length; i++){
            int productValue = 1;
            for(int j =0; j < inputArray.length; j++){
                if(inputArray[j] != inputArray[i]){
                    productValue = productValue * inputArray[j];
                }
            }
            resultArray[i] = productValue;
        }
        return resultArray;
    }

    public static int[] getProductExceptSelf(int[] inputArray){
        int length = inputArray.length;
        int[] resultArray = new int[length];
        int[] leftArray = new int[length];
        int[] rightArray = new int[length];

        leftArray[0] = 1;
        rightArray[length-1] =1;

        for(int i = 1; i<inputArray.length; i++){
            leftArray[i] = inputArray[i-1] * leftArray[i-1];
        }

        for(int i = length-2; i >= 0; i--){
            rightArray[i] = inputArray[i+1] * rightArray[i+1];
        }

        for(int i=0; i <length; i++){
            System.out.println("Left " + leftArray[i] +" Right"+ rightArray[i]);
            resultArray[i] = leftArray[i] * rightArray[i];
        }

        return resultArray;
    }

}
