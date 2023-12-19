package com.cg.sortingelementsoftreemapwithlambadexpression;

import java.util.TreeMap;
import java.util.TreeSet;


class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer,String>((t1,t2)->(t1>t2)?-1:(t1<t2)?1:0);
		t.put(10, "Suri");
		t.put(0, "subbu");
	    t.put(20, "hari");
	    t.put(50, "sravani");
	    System.out.println(t);
	    
	}

}

//
//class TreeMapDemo {
//
//	public static void main(String[] args) {
//
//		TreeMap<Integer, String> t = new TreeMap<Integer,String>();
//		t.put(10, "Suri");
//		t.put(0, "subbu");
//	    t.put(20, "hari");
//	    t.put(50, "sravani");
//	    System.out.println(t);
//
//	    
//	}
//
//}


