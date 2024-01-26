package com.cg.ListTpoics;

import java.util.ArrayList;

public class ArrayListExample2 {
	
	public static void main (String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		
	for(int i = 0; i<=al.size(); i++) { // forword direction
		//String Clr =al.get(i);
		System.out.println(i);
	}
	
	for(int i = al.size()-1; i>=0; i--) { // reverse direction
		//String Clr =al.get(i);
		System.out.println(i);
	}
	
//	for(String Clr:al) {
//		System.out.println(Clr);
//	}
	
		
	}

}
