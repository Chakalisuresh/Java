package com.cg.MethodOverloading;


public class Airtel {
	
	String un = "suresh";
	String pwd = "Password@123";
	String name = "HDFC";
	String expDate = "23//25"; 
	
	long  l= 6587468363837L;
	int i = 111;
	
	
	
	void makePayment(String un, String pwd) {
		
		System.out.println("make a payment");
		
		
	}
	
	void makePayment(long MobNo) {
		
		System.out.println("make a payment");
		
	}
	
	void makePayment(long cardNo, int cvv, String name, String expDate) {
		
	}
	
	public static void main (String args[]) {
		
		Airtel a1 = new Airtel();
		 a1.makePayment(0);
	}

}
