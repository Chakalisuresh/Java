package com.cg.constructor;

//This is Default Constructor
//public class Mobile {
//	
//	int price;
//	String Color;
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Mobile m1 = new Mobile();
//		m1.price=1200;
//		m1.Color="Red";
//		
//		System.out.println(m1.price);
//		System.out.println(m1.Color);
//		
//		
//		
//
//	}
//
//}

//This is Custom/Parameterized Constructor
public class Mobile {
	
	int price;
	String Brand;

public Mobile(int price, String Brand) {
	
	this.price = price;
	this.Brand = Brand;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m1 = new Mobile(12000, "Iphone");
		Mobile m2 = new Mobile(15000, "Realme");
		
	     System.out.println(m1.price);
	     System.out.println(m1.Brand);
	     System.out.println(m2.price);
	     System.out.println(m2.Brand);
	     
	
		
		
		

	}
}


