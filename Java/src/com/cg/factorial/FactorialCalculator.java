package com.cg.factorial;


public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5; // Change this to the number for which you want to calculate the factorial
        long factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Factorial is not defined for negative numbers.
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
