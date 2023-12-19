package com.cg.defaultmethodinsidetheinterfaces1;

interface Interf {
	default void m1() {
		System.out.println("Default Method");
	}

}

class Test implements Interf{
	
		
		public void m1() {
			System.out.println("My Own implementations.....");
		}
		public static void main(String[] aags) {
		Test t= new Test();
		t.m1();
		
	}
}
