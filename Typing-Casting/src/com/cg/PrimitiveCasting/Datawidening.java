package com.cg.PrimitiveCasting;

public class Datawidening { // here data changing Byte->Short->Int->Long->Float->Double
	
	public static void main (String args[]) {
		
		int i = 100;
		
		long l = i;
		
		float f = l;
				
		System.out.println("int value "+i);
		System.out.println("long value "+l);
	    System.out.println("float value "+f);
		
		
	}

}
