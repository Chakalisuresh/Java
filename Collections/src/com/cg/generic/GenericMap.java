/**
 * 
 */
package com.cg.generic;
import java.util.*;

/**
 * @author CSURESH
 *
 */
public class GenericMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Suri");
		map.put(2, "mahe");
		map.put(3, "sai");
		
		System.out.println(map);
		
		for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
		
		

	}

}
