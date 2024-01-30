package com.cg.String;

public class Revesestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		String str = "ABCD";
//		String rev = "";
//		 
//		int len = str.length();
//		for(int i = len -1; i>=0; i--) {
//			rev = rev+str.charAt(i);
//		}
//
//		System.out.println("Reverse String is:"+ rev);
//		
		
		//USING CHARARRAY
		// char a[]=str.toCharArray();
		// int len = a.length; 
		// for(int i = len-1; i>=0; i--) {
		//	 rev=rev+a[i];
		//	 System.out.println("Reverse String is:"+ rev);
		// }

//
//		//USING STRING BUFFER
	    StringBuffer sb = new StringBuffer(str);
	    System.out.print(sb.reverse());
	    
	    		
	}
	}
