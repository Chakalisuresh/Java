package com.cg.SortingList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lst  = new ArrayList<String>();
		
		lst.add("A");
		lst.add("X");
		lst.add("D");
		lst.add("D");
		lst.add("Y");
		
		System.out.println(lst);
		
		Collections.sort(lst);
		System.out.println(lst);
		
		Collections.sort(lst,Collections.reverseOrder());
		System.out.println(lst);
		
		

	}

}
