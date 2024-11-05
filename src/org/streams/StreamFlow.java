package org.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFlow {

    public static void main(String[] args){

        int[][] matrixArray = {{1,2,3},{4,5,6},{7,8,9}};
        spiralMatrixOrder(matrixArray);

        List<String> stringArray = new ArrayList<String>(Arrays.asList("Jason","Michael", "Richard", "Josephine", "David"));
        System.out.println("Longest String>> "+longestString(stringArray));

        List<Integer> numberList = Arrays.asList(5, 2, 1, 3, 4);
        System.out.println("Average Value>> "+medianOfIntegers(numberList));

        List<Integer> doubledList = doubleArrayValues(numberList);
        System.out.println("doubledList>> "+doubledList);

        int sumOfIntegers = numberList.stream().reduce(0,Integer::sum);
        System.out.println("sumOfIntegers>> "+sumOfIntegers);

        String[] arrayWithPrefix = new String[]{"fling", "flicker", "flight", "flier"};
        System.out.println("longestPrefix>> "+longestPrefixInString(arrayWithPrefix));
    }

    public static void spiralMatrixOrder(int[][] inputMatrixArray){

        Stream<int[]> myArray = Arrays.stream(inputMatrixArray);
        myArray.forEach(row -> System.out.println(Arrays.toString(row)));

        Arrays.stream(inputMatrixArray).flatMapToInt(Arrays::stream).forEach(System.out::println);

        int matrixSum = Arrays.stream(inputMatrixArray).flatMapToInt(Arrays::stream).sum();
        System.out.println("matrixSum>> "+matrixSum);

        Stream<Integer> myIntegerArray = Arrays.stream(inputMatrixArray).flatMapToInt(Arrays::stream).boxed();
        myIntegerArray.collect(Collectors.toList());
    }

    public static String longestString(List<String> inputList){
        Optional<String> result = inputList.stream().max(Comparator.comparingInt(String::length));
        return result.get();
    }

    public static Double medianOfIntegers(List<Integer> inputList){
        OptionalDouble result = inputList.stream().mapToInt(Integer::intValue).average();
        return result.getAsDouble();
    }

    public static List<Integer> doubleArrayValues(List<Integer> integerList){
        List<Integer> resultList = integerList.stream().map(n -> n * 2).collect(Collectors.toList());
        return resultList;
    }

    public static String longestPrefixInString(String[] stringList){
        String longestPrefix = Arrays.stream(stringList).reduce((s1, s2) -> {
           int length = Math.min(s1.length(),s2.length());
           int i =0;
           while (i < length && s1.charAt(i) == s2.charAt(i)){
               i++;
           }
           return s1.substring(0, i);
        }).orElse("");

        return longestPrefix;
    }

}
