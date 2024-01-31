package com.cg.String;

public class mutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder("Hello");
		
		str.append(" World");
		 System.out.println(str);
		 
		 str.insert(5, ","); // Insert a comma at index 5
	     str.delete(5, 6); // Delete the comma
	     str.replace(5, 6, " "); // Replace comma with space
	     
	     System.out.println(str);


	}

}
