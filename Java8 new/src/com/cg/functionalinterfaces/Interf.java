package com.cg.functionalinterfaces;

@FunctionalInterface  //1.8version 
interface Interf {
	public void m1();  //abstract method
	default void m2() {
		
	}
	public static void m3() {
		
	}

}
