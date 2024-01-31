package com.cg.String;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = new String("Hello");
		
		String str2 = str.concat("Wolrd");
		
		System.out.println(str);
		System.out.println(str2);
		
		str = "Hi";
		
		System.out.println(str);
		

	}

}
