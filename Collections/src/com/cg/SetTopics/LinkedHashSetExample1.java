package com.cg.SetTopics;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample1 {
	
	public static void main(String args[]) {
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("red");
		set.add("white");
	    set.add("yellow");
	    set.add("null");
	    set.add("green");
	    set.add("red");
	    System.out.println(set);
	    
	    Iterator itr=set.iterator();//getting the Iterator  
	    while(itr.hasNext()){//check if iterator has the elements  
	     System.out.println(itr.next());//printing the elements
	    }
		
	}

}
