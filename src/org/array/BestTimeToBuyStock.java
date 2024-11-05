package org.array;

import java.util.Arrays;

public class BestTimeToBuyStock {

    public static void main(String[] args){
        int[] prices = {7, 1, 5, 3, 6, 4};
        //int MaximumProfit = bruteForceMaxProfit(prices);
        //int MaximumProfit = bruteForceSimple(prices);
        int MaximumProfit = maxProfitOnePass(prices);
        System.out.println("MaximumProfit>> "+MaximumProfit);
    }

    private static int bruteForceMaxProfit(int[] inputArray){
        int calculatedMaxProfit = 0;
        int lowestBuy=0, highestSell =0;
        int dayToBuy=0, dayToSell=0;
        int[] sortedArray = inputArray.clone();
        Arrays.sort(sortedArray);

        lowestBuy = sortedArray[0];
        int maxIndex = sortedArray.length-1;

        for(int i =0; i< inputArray.length; i++){
            if(dayToBuy == 0 && inputArray[i] == lowestBuy){
                dayToBuy = i+1;
            }
        }

        for(int j =0; j < inputArray.length; j++){
            if(dayToBuy>0 && j > dayToBuy-1){
                highestSell = Math.max(inputArray[j], highestSell);
                dayToSell = j+1;
            }
        }
        System.out.println("dayToBuy = " + dayToBuy + " dayToSell = "+dayToSell);
        if(dayToBuy > 0 && dayToSell > 0){
            calculatedMaxProfit = highestSell - lowestBuy;
        }
        return calculatedMaxProfit;
    }

    private static int bruteForceSimple(int[] inputArray){
        int maxProfit = 0;

        for(int i =0; i < inputArray.length -1; i++){
            for(int j = i+1; j < inputArray.length; j++){
                int profit = inputArray[j] - inputArray[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    private static int maxProfitOnePass(int[] inputArray){
        int maxProfit = 0;

        int minPrice = Integer.MAX_VALUE;

        for(int i =0; i < inputArray.length; i++){
            if(inputArray[i] < minPrice){
                minPrice = inputArray[i];
            }else if(inputArray[i]-minPrice > maxProfit){
                maxProfit = inputArray[i]-minPrice;
            }
        }

        return maxProfit;
    }

}
