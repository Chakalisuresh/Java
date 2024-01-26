package com.cg.PrimitiveCasting;

public class Datanarrowing { // here data changing Double->Float->Long->Int->Short->Byte

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d =100.04;
		
		long l = (long)d;
		int i = (int)l;
		
		System.out.println("Double va;ue "+d);
		System.out.println("Long value "+l);
		System.out.println("Int value "+i);
		
		
	}
}

