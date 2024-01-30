package com.cg.thiskeyword;

public class Person {
	
	String name = "Ramu";
	
	void eat() {
	this.washHands();
	this.serveFood();
	System.out.println("eat food");
	this.washHands();
	}
	
	void washHands() {
		System.out.println("Wash the Hands");
	}
	
	void serveFood() {
		System.out.println("Serve the food");
	}
	
	
	public static void main (String args[]) {
		
		Person p = new Person();
		p.eat();
		
	}

}
