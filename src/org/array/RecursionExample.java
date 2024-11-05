package org.array;

public class RecursionExample {

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5: " + result);
    }

    public static int factorial(int n) {
        System.out.println("n: " + n);
        if (n == 0) { // Base case
            return 1;
        } else { // Recursive case
            return n * factorial(n - 1);
            //5 * 4 * 3 * 2 * 1 * 1
        }
    }
}