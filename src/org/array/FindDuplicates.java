package org.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String[] args){
        int[] inputArray = {1,2,3,4,5,3,7,8,2};
        int[] result = findDuplicatesHashSet(inputArray);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static int[] findDuplicatesBruteForce(int[] numberArray){
        int length = numberArray.length;
        int[] resultArray = new int[length];
        int resultIndex=0;

        for(int i=0; i < numberArray.length; i++){
            for(int j = i+1; j< numberArray.length; j++){
                if(numberArray[i] == numberArray[j]){
                    resultArray[resultIndex++] = numberArray[i];
                }
            }
        }

        return Arrays.copyOf(resultArray, resultIndex);
    }

    private static int[] findDuplicatesSort(int[] numberArray){
        int[] myArray = numberArray.clone();
        Arrays.sort(myArray);
        int length = myArray.length;
        int[] resultArray = new int[length];
        int resultIndex=0;

        for(int i=0; i < myArray.length-1; i++){
            if(myArray[i] == myArray[i+1]){
                resultArray[resultIndex++] = myArray[i];
            }
        }

        return Arrays.copyOf(resultArray, resultIndex);
    }

    private static int[] findDuplicatesHashSet(int[] numberArray){
        int[] resultArray = new int[numberArray.length];
        Set<Integer> unique = new HashSet<Integer>(numberArray.length);
        Set<Integer> duplicates = new HashSet<Integer>(numberArray.length);

        for(int x: numberArray){
            if(unique.contains(x)){
                duplicates.add(x);
            }else{unique.add(x);}

        }
        resultArray = duplicates.stream().mapToInt(Integer::intValue).toArray();
        return resultArray;
    }

}
