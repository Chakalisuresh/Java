package com.cg.sortingelementsofarraylistwithlambadexpression2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//Comparators
//
//class MyComparator implements Comparator<Integer>{
//	public int compare(Integer list1, Integer list2) {
//		return (list1>list2)?-1:(list1<list2)?1:0;
//	}
//	}
public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(0);
	    list.add(20);
	    list.add(50);
	    System.out.println(list);
	    Collections.sort(list,(list1, list2)->(list1>list2)?-1:(list1<list2)?1:0);
	    System.out.println(list);
	}

}

