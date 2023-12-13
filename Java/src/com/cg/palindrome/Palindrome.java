package com.cg.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String input = "racecar"; // Change this to the string you want to check for palindromes
        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase(); // Remove spaces and convert to lowercase for case-insensitive check.
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters at the left and right positions do not match, it's not a palindrome.
            }
            left++;
            right--;
        }
        return true; // If the loop completes without finding a mismatch, it's a palindrome.
    }
}
