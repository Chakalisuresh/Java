package com.cg.invokinglambdaexpressioninfunctionalinterfaces1;

// interface Interf {
//	 
//	 public void m1();
//
//}
// class Demo implements Interf{
//	 public void m1() {
//		 System.out.println("normal implementation");
//		
//	}
//	 
// }
//
// class Test2{
//	 
//	public static void main(String[] args) {
//		Interf i = new Demo();
//		i.m1();
//		
//	}
// }


interface Interf {
	 
	 public void m1();

}

class Test2{
	 
	public static void main(String[] args) {
		Interf i = ()->System.out.println("lambda implementation");
		i.m1();
		
	}
}