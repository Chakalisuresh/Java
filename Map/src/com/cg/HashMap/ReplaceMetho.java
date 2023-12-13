/**
 * 
 */
package com.cg.HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CSURESH
 *
 */
public class ReplaceMetho {

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
		
		System.out.println(map);
		
		for(Map.Entry m: map.entrySet()) {
			   System.out.println(m.getKey()+" "+m.getValue());
		   }
		
		
		map.replace(3, "imran");
		System.out.println("Updating............");
		
		for(Map.Entry m2: map.entrySet()) {
			   System.out.println(m2.getKey()+" "+m2.getValue());
		   }
	}
}
