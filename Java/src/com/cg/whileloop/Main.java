package com.cg.whileloop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name ="";
	do {
			System.out.println("enter your name");
			name = sc.nextLine();
	}
	while(name.isBlank());
			
		System.out.println(name);

	}
	}

