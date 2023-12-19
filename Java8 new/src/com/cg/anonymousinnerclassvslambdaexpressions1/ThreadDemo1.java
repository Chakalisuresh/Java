package com.cg.anonymousinnerclassvslambdaexpressions1;


//anonymous inner class

public class ThreadDemo1 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {     //anonymous inner class
			public void run() {
				for(int i= 0; i<10; i++) {
					System.out.println("Chaild thread");
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i= 0; i<10; i++) {
			System.out.println("Main thread");
		}
		
	}
}

//with lambda expressions

//public class ThreadDemo1 {
//
//	public static void main(String[] args) {
//		Runnable r = ()->{for(int i= 0; i<10; i++) {
//			System.out.println("Chaild thread");
//		}
//	};
//	Thread t = new Thread(r);
//	t.start();
//	for(int i= 0; i<10; i++) {
//		System.out.println("Main thread");
//	}
//	
//}
//}


//
//public class ThreadDemo1 {
//
//	public static void main(String[] args) {
//		Runnable r = ()->{for(int i= 0; i<10; i++) {
//			System.out.println("Chaild thread");
//		}
//	};
//	Thread t = new Thread(()->{for(int i= 0; i<10; i++) {
//		System.out.println("Main thread");
//	}
//	});
//	t.start();
//	
//	
//}
//}
