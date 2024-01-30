package com.cg.methodexample;

public class Pen {
	
	int price = 40;
	String Color = "Red";
	
	void write() { 
	 System.out.println("pen writes");
	}
	public static void main (String args[]) {
		
		System.out.println("Mains Start");;
		
		Pen p1 = new Pen();
		p1.write();
		
		System.out.println("Main ends");
	}
	

}
