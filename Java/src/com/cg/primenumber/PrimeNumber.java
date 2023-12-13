package com.cg.primenumber;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29; // Change this to the number you want to check for primality
        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime.
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any integer from 2 to the square root of the number, it's not prime.
            }
        }

        return true; // If the number is not divisible by any integer from 2 to the square root, it's prime.
    }
}
