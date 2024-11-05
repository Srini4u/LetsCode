package org.streams;

import org.util.Person;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsLearn {

    public static void main(String[] args){
        List<Person> personList = Arrays.asList(new Person("Jason", 28), new Person("Richard", 42), new Person("Penelope", 25));
        Long averageAgeResult = averagePersonAge(personList);
        System.out.println("averageAgeResult>>> "+averageAgeResult);

        List<Integer> integerArray1 = Arrays.asList(1 ,3, 5, 7, 9);
        List<Integer> integerArray2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> mergedList = listMergedAndSorted(integerArray1, integerArray2);
        mergedList.stream().forEach(System.out::println);

    }

    public static Long averagePersonAge(List<Person> inputPersonList){
        OptionalDouble averageAge = inputPersonList.stream().mapToInt(Person::getAge).average();
        return Math.round(averageAge.getAsDouble());
    }

    public static List<Integer> listMergedAndSorted(List<Integer> inputArray1, List<Integer> inputArray2){
        List<Integer> mergedResultList = Stream.concat(inputArray1.stream(), inputArray2.stream()).sorted().collect(Collectors.toList());
        return mergedResultList;
    }
}
