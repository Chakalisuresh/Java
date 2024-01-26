package com.cg.MapTopics;


import java.util.*;

/**
 * @author CSURESH
 *
 */
public class HashMap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		  Map<Integer,String> map = new HashMap<Integer,String>();
		//Map<Integer, String> map = new LinkedHashMap<Integer, String>();	
		//Map<Integer,String> map = new TreeMap<Integer,String>();// use key value, pairs
		//Hashtable<Integer,String> map =new Hashtable<Integer,String>();  // use key value, pairs
		
		map.put(1, "Suri");
		map.put(2, "mahe");
		map.put(3, "sai");
		//map.put(1, "Ravi"); //duplicate key is not store when you try its replaced
		System.out.println(map);
		
		for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
//		
//		Map<Integer,String> map1 = new HashMap<Integer,String>();
//		map1.put(1, "Suri");
//		map1.put(2, "mahe");
//		map1.put(3, "sai");
//		//map.put(1, "Ravi"); //duplicate key is not store when you try its replaced
//		System.out.println(map1);
//		
//		Map<Integer,String> map2= new HashMap<Integer,String>();
//		map2.put(1, "Krishan");
//		map2.put(2, "pooja");
//		map2.put(3, "Suresh");
//		System.out.println(map2);
//		
//
//		Map<Integer,String> map3 = new HashMap<Integer,String>();
//		map3.putAll(map1);
//		map3.putAll(map2);
//		System.out.println(map3.size());
//		System.out.println(map3.isEmpty());
//
//	
//		
//		for(Map.Entry m:map3.entrySet()) {
//		System.out.println(m.getKey()+" "+m.getValue());
//		}

	}
}


