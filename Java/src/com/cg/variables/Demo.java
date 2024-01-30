package com.cg.variables;

//Vaeiables-> two types 
//Golobal variable have a two types(static or class  and  non static or instances ) its a class level amnd out side the method variables
//locla variables-> its a inside method variables 


public class Demo {
	
//	static int count = 0; //global varible
	
//	public void increment() {
//		count++;
//	}
//	
//	public static void main (String args[]) {
//		
//		Demo d = new Demo()	;
//			
//			d.increment();
//			
//			System.out.println(d.count);
//		
//			
//		}
	
	static int age=30;
	static String name = "Ramu";
	
	static void disp() {
		System.out.println("Age is:" +age);
		System.out.println("Age is:" +name);
		
	}
	
	public static void main (String args[]) {
		
		Demo d = new Demo();
		
		//age= 30;
		//name = "Ramu";
		d.disp();
	}
	
	
	
	 
	
	
	

}
