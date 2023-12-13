/**
 * 
 */
package com.cg.HashMap;

import java.util.HashMap;

/**
 * @author CSURESH
 *
 */
public class RemoveMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<Integer,String>();	
		//LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		//TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		//Hashtable<Integer,String> map =new Hashtable<Integer,String>();  
		map.put(1, "Suri");
		map.put(2, "mahe");
		map.put(3, "sai");
		
		//Get all data
		System.out.println(map);
		
		map.remove(1);
		
		System.out.println(map);

		map.remove(3);
		System.out.println(map);
		
		
	}

}
;