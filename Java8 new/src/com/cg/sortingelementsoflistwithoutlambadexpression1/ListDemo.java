package com.cg.sortingelementsoflistwithoutlambadexpression1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("suri");
		list.add("sai");
	    list.add("Red");
	    list.add("Red");
	    System.out.println(list);
	}

}

//using sorting

//
//public class ListDemo {
//
//	public static void main(String[] args) {		
//		
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		
//		list.add(10);
//		list.add(0);
//	    list.add(20);
//	    list.add(50);
//	    System.out.println(list);
//	    Collections.sort(list);
//	    System.out.println(list);
//	}
//
//}

//Comparators
//
//class MyComparator implements Comparator<Integer>{
//	public int compare(Integer list1, Integer list2) {
//		if(list1>list2) {
//			return -1;
//		}
//		else if(list1<list2) {
//			return +1;
//		}
//		else {
//			return 0;
//		}
//	}
//}
//
//public class ListDemo {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		
//		list.add(10);
//		list.add(0);
//	    list.add(20);
//	    list.add(50);
//	    System.out.println(list);
//	    Collections.sort(list,new MyComparator());
//	    System.out.println(list);
//	}
//
//}

