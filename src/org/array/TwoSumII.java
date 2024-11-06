package org.array;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args){
        int[] nums = {9, 3, 4, 2, 7, 12, 15};
        int target = 13;
        int[] resultIndices = findIndices(nums, target);
        System.out.println("resultIndices>> "+ Arrays.toString(resultIndices));
    }

    private static int[] findIndices(int[] numbers, int targetSum){
        int[] resultArray = null;
        for(int i =0; i < numbers.length; i++){
           for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] == targetSum - numbers[i]){
                    resultArray = new int[]{i, j};
                    return resultArray;
                }
           }
        }
        return new int[]{0,0};
    }

    public static int[] findIndicesTwoSum(int[] numbers, int targetSum){
        int[] inputArray = numbers.clone();
        Arrays.sort(inputArray); //2,3,4,7,9,12,15

        int left = 0;
        int right = inputArray.length - 1;

        while(left < right){
            int sum = inputArray[left] + inputArray[right];
            if(targetSum == sum){
                int num1 = inputArray[left];
                int num2 = inputArray[right];
                int index1 = -1, index2 = -1;
                for(int i =0; i < numbers.length ; i++){
                    if(numbers[i] == num1 && index1 == -1){
                        index1 = i;
                    }else if(numbers[i] == num2 && index2 ==-1 ){
                        index2 = i;
                    }
                }
                //return the original index
                return new int[]{index1, index2};
            } else if(targetSum > sum){
                left++;
            } else if(targetSum < sum){
                right--;
            }
        }

        return new int[]{};
    }


}
