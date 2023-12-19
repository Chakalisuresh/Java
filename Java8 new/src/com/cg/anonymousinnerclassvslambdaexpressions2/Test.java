package com.cg.anonymousinnerclassvslambdaexpressions2;


//anonymous inner class

interface Interf{
	public void m1();
		
	
}
class Test {
	
	int x =888;
	public void m2() {
		Interf i = new Interf() {
			int x = 999;
			public void m1() {
				System.out.println(this.x); //999
				
			}
		};
		
		i.m1();
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m2();
		
		}
}
		

//with lambda expressions


//interface Interf{
//	public void m1();
//		
//	
//}
//class Test {
//	
//	int x =888;
//	public void m2() {
//		Interf i = ()->{
//			int x = 999;
//			System.out.println(this.x);	//888
//			
//		};
//		
//		i.m1();
//	}
//
//	public static void main(String[] args) {
//		Test t = new Test();
//		t.m2();
//		
//		}
//}