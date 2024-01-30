package com.cg.VariableShadowing;

public class Demo {

	String name = "Rame";
	int age = 21;
	
	public void display() {
		
		String name = "Hari";
		int age = 40;
		
	    System.out.println("Name ="+name);
	    System.out.println("Age ="+age);
	    
	    //using this key word
	   // System.out.println("Name ="+this.name);
	    //System.out.println("Age ="+this.age);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
		d.display();

	}

}
