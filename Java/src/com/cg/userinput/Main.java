


package com.cg.userinput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name");
		String name =sc.nextLine();
		
		System.out.println("How 0ld are you");
		String age = sc.nextLine();
		
		System.out.println("which your are studing");
		String studing =sc.nextLine();
		sc.nextLine();
		
		System.out.println("Hello:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Study is:"+ studing);
		
	}

}
