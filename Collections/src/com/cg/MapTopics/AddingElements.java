/**
 * 
 */
package com.cg.MapTopics;
import java.util.*;

/**
 * @author CSURESH
 *
 */
public class AddingElements {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		 HashMap<Integer,String> map=new HashMap<Integer,String>();  
	   //LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer, String>();
	  //TreeMap<Integer,String> map  = new TreeMap<Integer,String>();
		 //Hashtable<Integer,String> map=new Hashtable<Integer,String>();  
		   
		   map.put(1,"Mango");  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");  
		   
		   System.out.println(map);
		   
		   for(Map.Entry m: map.entrySet()) {
			   System.out.println(m.getKey()+" "+m.getValue());
		   }
		   
		   
		   map.putIfAbsent(5, "Guva");
		   System.out.println("After adding element");
		
	
		   for(Map.Entry m1: map.entrySet()) {
			   System.out.println(m1.getKey()+" "+m1.getValue());
		   }
		   
		   HashMap<Integer,String> map1=new HashMap<Integer,String>();  
		   map.put(6,"cherry");  
		   
		   map.putAll(map1);
		   
		   System.out.println("Creating new hashmap and adding new element and all elments put in new hashmap");

		   for(Map.Entry m2: map.entrySet()) {
			   System.out.println(m2.getKey()+" "+m2.getValue());
		   }
		   

	}

}
