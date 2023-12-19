package com.cg.invokinglambdaexpressioninfunctionalinterfaces2;
//
// interface Interf {
//	 public void add(int a, int b);
//
//}
// class Demo implements Interf{
//	 public void add(int a, int b) {
//		 System.out.println("The sum by normal implementation"+(a+b));
//	 }
// }
// 
// class Test2{
//	 public static void main(String[] arg) {
//		 Interf i = new Demo();
//		 i.add(10,20);
//		 i.add(100, 200);
//	 }
// }



interface Interf {
	 public void add(int a, int b);

}
class Demo implements Interf{
	 public void add(int a, int b) {
		 System.out.println("The sum by normal implementation"+(a+b));
	 }
}

class Test2{
	 public static void main(String[] arg) {
		 Interf i = (a,b)->System.out.println("The sum by lambda implementation"+(a+b));
		 i.add(10,20);
		 i.add(100, 200);
	 }
}
