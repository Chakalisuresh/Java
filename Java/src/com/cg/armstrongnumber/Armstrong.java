package com.cg.armstrongnumber;


public class Armstrong{
    public static void main(String[] args) {
        int number = 155; // Change this to the number you want to check for being an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);

        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return originalNumber == sum;
    }
}
