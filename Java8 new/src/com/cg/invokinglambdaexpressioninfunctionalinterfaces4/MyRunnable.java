package com.cg.invokinglambdaexpressioninfunctionalinterfaces4;


// class MyRunnable implements Runnable {
//	 public void run() {
//		 for (int i=0; i<10; i++) {
//			 System.out.println("child thread");
//			 
//		 }
//	 }
//
//}
//
// class ThreadsDemo1{
//	 public static void main(String[] arg) {
//		 Runnable r = new MyRunnable();
//		 Thread t= new Thread(r);
//		 t.start();
//		 for(int i=0; i<10;i++) {
//			 System.out.println("Main thread");
//		 }
//		 
//		
//	}
// }
// 


class ThreadsDemo1{
	 public static void main(String[] arg) {
		 Runnable r =()->{
			 for(int i =0; i<10; i++) {	 
			 System.out.println("Lambda: child Thread");
		 }};
		 Thread t= new Thread(r);
		 t.start();
		 for(int i=0; i<10;i++) {
			 System.out.println("Main thread");
		 }
		 
		
	}
}