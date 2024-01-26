package com.cg.SetTopics;


import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Set<String> set = new HashSet<String>();
		
		set.add("suri");
		set.add("sai");
	    set.add("Red");
	    set.add("null");
	    set.add("Red");
	    set.add("null");
	    set.add("yyy");
	    System.out.println(set);
	    
	    Iterator itr=set.iterator();//getting the Iterator  
	    while(itr.hasNext()){//check if iterator has the elements  
	     System.out.println(itr.next());//printing the elements
	    }

		
	}

}
