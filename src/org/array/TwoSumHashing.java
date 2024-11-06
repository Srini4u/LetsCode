package org.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashing {

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumIndexes(nums, target);
        //Arrays.stream(result).forEach(System.out::println);
        System.out.println("Result>> "+ Arrays.toString(result));
    }

    public static int[] twoSumIndexes(int[] inputArray, int target){
        int[] resultArray = new int[]{};

        Map<Integer, Integer> indexMap = new HashMap<>();

        for(int i =0; i < inputArray.length; i++){
            int composite = target - inputArray[i];
            if(indexMap.containsKey(composite)){
                resultArray = new int[]{indexMap.get(composite), i};
                return resultArray;
            }
            indexMap.put(inputArray[i],i);
        }

        return resultArray;
    }


}
