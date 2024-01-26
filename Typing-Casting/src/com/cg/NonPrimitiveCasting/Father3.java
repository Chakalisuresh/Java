package com.cg.NonPrimitiveCasting;

//Down casting
public class Father3 {
	
	public void work() {
		System.out.println("Earning Father");
	}

	class Son extends Father3{
		 public void play() {
			 System.out.println("Enjoying Son");
		 }
	}
}
