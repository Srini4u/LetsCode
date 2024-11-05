package org.basics;

import java.util.HashSet;

public class HashSetSolution {

    public static void main(String[] args){
        HashSet<String> employeeHashSet = new HashSet<String>();
        employeeHashSet.add("Alice");
        employeeHashSet.add("Johny");
        employeeHashSet.add("Smith");
        employeeHashSet.add("Smith");

        System.out.println("HashSet>>> "+employeeHashSet);
    }

}
