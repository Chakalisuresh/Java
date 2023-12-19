package com.cg.sortingelementsoftreesetwithlambadexpression;

import java.util.TreeSet;


class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>((t1,t2)->(t1>t2)?-1:(t1<t2)?1:0);
		t.add(10);
		t.add(0);
	    t.add(20);
	    t.add(50);
	    System.out.println(t);
	    
	}

}
//
//class TreeSetDemo {
//
//	public static void main(String[] args) {
//		TreeSet<Integer> t = new TreeSet<Integer>();
//		t.add(10);
//		t.add(0);
//	    t.add(20);
//	    t.add(50);
//	    System.out.println(t);
//	    
//	}
//
//}


