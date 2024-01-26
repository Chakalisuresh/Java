
package com.cg.nongenericmap;
import java.util.*;  

/**
 * @author CSURESH
 *
 */
public class NonGenericMap {
	
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		//Adding elements
		map.put(1, "Suri");
		map.put(2, "Sai");
		map.put(3, "pooja");
		
		//getting all elements
		System.out.println(map);
		
		//Traversing map
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry entry = (Map.Entry)itr.next(); 
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		
		
		
		

	}

}
