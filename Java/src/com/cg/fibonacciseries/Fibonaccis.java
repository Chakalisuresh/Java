package com.cg.fibonacciseries;

public class Fibonaccis {
	public static void main(String[] args) {
		
        int n = 10; // Change this to generate a different number of terms
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
