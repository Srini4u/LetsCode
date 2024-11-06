package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTwoPointer {

    public static void main(String[] args){

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4}; //Output: [[-1, 0, 1],[-1, -1, 2]]
        List<List<Integer>> result = threeSum(nums);
        result.stream().forEach(System.out::println);
    }

    public static List<List<Integer>> threeSum(int[] inputArray){
        Arrays.sort(inputArray);
        List<List<Integer>> resultArray = new ArrayList<>();
        for(int i=0; i < inputArray.length && inputArray[i] <= 0; i++){
            if(i ==0 || inputArray[i-1] != inputArray[i]){
                twoSumII(inputArray, i, resultArray);
            }
        }
        return resultArray;
    }

    public static void twoSumII(int[] inputArray, int i, List<List<Integer>> resultArray){
        int left = i+1;
        int right = inputArray.length-1;
        while(left < right){
            int sum = inputArray[i] + inputArray[left] +inputArray[right];
            if(sum < 0){
                left++;
            }else if (sum > 0){
                right--;
            }else{
                resultArray.add(Arrays.asList(inputArray[i], inputArray[left++], inputArray[right--]));
                while(left<right && inputArray[left-1] == inputArray[left]){
                    left++;
                }
            }
        }
    }


}
