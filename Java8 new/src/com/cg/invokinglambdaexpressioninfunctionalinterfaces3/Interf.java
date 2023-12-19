package com.cg.invokinglambdaexpressioninfunctionalinterfaces3;

//
//interface Interf {
//public int getLength(String s);
//}
//class Demo implements Interf{
//	 public int getLength(String s){
//		 return s.length();
//		
//	}
//	 
//}
// class Test1{
//	 public static void main(String[] arg) {
//		
//		 Interf i =new Demo();
//		 System.out.println(i.getLength("Length"));
//		 System.out.println(i.getLength("with out Lambda expressions"));
//	}
// }


interface Interf {
public int getLength(String s);
}

 class Test1{
	 public static void main(String[] arg) {
		
		 Interf i = s-> s.length();
		 System.out.println(i.getLength("Hello"));
		 System.out.println(i.getLength("Lambda expressions"));
	}
 }
 
 
 

 