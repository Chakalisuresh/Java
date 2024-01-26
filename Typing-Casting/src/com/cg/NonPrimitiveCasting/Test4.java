package com.cg.NonPrimitiveCasting;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SketchPen sp1 = new SketchPen();
		SketchPen sp2 = sp1;
		
		Pen4 p = sp1; //upcasting
		Object o = sp1; //UpCasting
		
		Pen4 p1 = new Pen4();
		Pen4 p2 =p;
		
		Object o1= p;//UpCasting
	//	MarkerPen mp = p;//Error
		
		MarkerPen mp1 = (MarkerPen)p;//DownCasting
		//SketchPen sp3 = (SketcchPen)p;//Gives ClassCast Exceptions
		
		
		

	}

}
