package com.cg.mathclass;

import java.util.Scanner;

public class Main2 {
	int x;
	int y ;
	double z;
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" x side is  :");
	     int x = sc.nextInt();
		
		System.out.println(" y side is :");
		int y = sc.nextInt();
		
		double z = Math.sqrt((x*x)+(y*y));
		System.out.println("hypotness is:" +z);
		
	}

}
