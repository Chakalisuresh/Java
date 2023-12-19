package com.cg.defaultmethodinsidetheinterfaces2;

//Default methods write multiple ;
interface Right {
	default void m1() {
		System.out.println("Right Default Method");
	}

}


interface Left {
	default void m1() {
		System.out.println("Left Default Method");
	}

}

class Test implements Right,Left {
	public void m1() {
		System.out.println("My Own implementations.....");
		Left.super.m1();
		Right.super.m1();
	}
	public static void main(String[] aags) {
	Test t= new Test();
	t.m1();
	
}

}
