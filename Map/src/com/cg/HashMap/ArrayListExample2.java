package com.cg.HashMap;
///**
// * 
// */
//package com.cg.HashMap;
//
//import java.util.*;
//
///**
// * @author CSURESH
// *
// */
//public class HashMap1 {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		
//		
//		HashMap<Integer,String> map = new HashMap<Integer,String>();	
//		map.put(1, "Suri");
//		map.put(2, "mahe");
//		map.put(3, "sai");
//		//map.put(1, "Ravi"); //duplicate key is not store when you try its replaced
//		System.out.println(map);
//		
//		for(Map.Entry m:map.entrySet()) {
//		System.out.println(m.getKey()+" "+m.getValue());
//		}
//
//	}
//
//}






import java.util.*;  
public class ArrayListExample2{  
 public static void main(String args[]){  
	 
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
//TreeMap<Integer,String> map = new TreeMap<Integer,String>();
 //Hashtable<Integer,String> map =new Hashtable<Integer,String>();  

  
  list.add("Mango");//Adding object in arraylist    
  list.add("Apple");    
  list.add("Banana");    
  list.add("Grapes");    
  //Traversing list through Iterator  
  Iterator itr=list.iterator();//getting the Iterator  
  while(itr.hasNext()){//check if iterator has the elements  
   System.out.println(itr.next());//printing the element and move to next  
  }  
 }  
}  