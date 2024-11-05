package org.array;

import java.util.Arrays;

public class SelfProductTest {

    public static void main(String[] args){
        int[] myArray = new int[]{2, 4, 9, 5, 7}; //[1260, 630, 280, 504, 360]
        int[] resultArray = arraySelfMultiplier(myArray);
        System.out.println("resultArray = " + Arrays.toString(resultArray));
    }

    public static int[] arraySelfMultiplier(int[] inputArray){
        int arrayLength = inputArray.length;
        int[] leftArray = new int[arrayLength];
        int[] rightArray = new int[arrayLength];
        int[] resultArray = new int[arrayLength];
        leftArray[0]=1;
        rightArray[arrayLength-1]=1;

        for(int i = 1; i <arrayLength; i++){
            leftArray[i] = leftArray[i-1] * inputArray[i-1];
        }

        for(int j = arrayLength-2; j >=0 ; j--){
            rightArray[j] = rightArray[j+1] * inputArray[j+1];
        }

        for(int k =0; k < arrayLength; k++){
            resultArray[k] = leftArray[k] * rightArray[k];
        }

    return resultArray;
    }

    public static int[] bruteForce(int[] inputArray){
        int arrayLength = inputArray.length;
        int[] resultArray = new int[arrayLength];


        for(int i =0; i < arrayLength; i++){
            int productSelf = 1;
            for(int j=0; j < arrayLength; j++){
                if(inputArray[i] != inputArray[j]){
                    productSelf = productSelf * inputArray[j];
                }
            }
            resultArray[i] = productSelf;
        }

        return resultArray;
    }

}
