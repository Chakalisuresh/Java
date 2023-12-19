package com.cg.defaultmethodsinsidetheinterfaces3;



// static method inside the interfaces;
interface Interf {
	public static void m1() {
		System.out.println("Interface static Method");
	}

}

class Test implements Interf {
	
	public static void main (String[] args) {
		
		Test t = new Test();
		
		Interf.m1();
	}
	
	 

}
