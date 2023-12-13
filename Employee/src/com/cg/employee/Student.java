package com.cg.employee;

import java.util.Scanner;

//package com.cg.employee;
//
//import java.util.Scanner;
//
////package com.cg.employee;
////
////import java.util.Scanner;
////
//////package com.cg.employee;
//////
//////import java.util.Scanner;
//////
////////class Main {
////////	  public static void main(String[] args) {
////////	    Scanner sc = new Scanner(System.in);
////////	   String userName;
////////	    String userid;
////////	    String   usercellno;
////////	    String useremail;
////////	    System.out.println("Enter the details"); 
////////	    
////////	   /*String*/ userName = sc.nextLine(); 
////////	    System.out.println("Username is:"); 
////////	   /*String*/ userid = sc.nextLine();
////////	    System.out.println("Userid is:" );
////////	   /* String*/ usercellno = sc.nextLine();
////////	    System.out.println("Usercellno is:" );
////////	    /*String*/ useremail= sc.nextLine();
////////	    System.out.println("Useremail is:" );
////////	    sc.nextLine();
////////	    
////////	  /* System.out.println("name is:"+userName);
////////	   System.out.println("id is:"+userid);
////////	    System.out.println("cellno is:"+usercellno);
////////	    System.out.println("email is:"+useremail);***/
////////	     
////////		
////////	}
////////	}     
////////
//////public class Suri {
//////
//////
//////
//////	   public static void main(String[] args) {
//////	        // TODO Auto-generated method stub
//////
//////
//////
//////	       Scanner sc = new Scanner(System.in);
//////	        System.out.println("Enter The student roll number:");
//////	        int rollnumber = sc.nextInt();
//////	        System.out.println("Enter The student phone number:");
//////	        int phonenumber = sc.nextInt();
//////	        System.out.println("Enter The student address:");
//////	        String address = sc.nextLine();
//////	        sc.next();
//////	        
//////	        
//////	        Suri obj = new Suri();
//////	        Suri obj2 = new Suri();
//////	        obj.setRollnumber( rollnumber);
//////	        obj.setPhonenumber( phonenumber);
//////	        obj.setAddress(address);
//////	        System.out.println("Sam Details");
//////	        System.out.println("Roll number :"+obj.getRollnumber);
//////	        System.out.println("Phonenumber :"+obj.getPhonenumber);
//////	        System.out.println("Address :"+obj.getAddress);
//////	        
//////	        
//////	        
//////	        
//////	    }
//////
//////
//////
//////	}
////
////
//////class Student {
//////
//////int RollNumber;
//////
//////int PhoneNumber;
//////
//////String Address;
//////
//////}
////
////public class CreateClass {
////
////public static void main(String[] args) {
////	Scanner sc = new Scanner(System.in);
////
////System.out.println("details:");
////	 
////
////String Sam = sc.next();
////
////String John = sc.next();
////
////
//////System.out.println("Sam Details");
////System.out.println("Sam Roll number is:- " + Sam);
////System.out.println("Sam Phonenumber:-" + Sam);
////System.out.println("Sam Address is:-" + Sam);
////}
////}
////
////
////
////
//////Sam.RollNumber=
//////
//////Sam.PhoneNumber=1234567890;
//////
//////Sam.Address="London !";
//////
//////John.RollNumber=01;
//////
//////John.PhoneNumber=976541230;
//////
//////John.Address="China !";
//////
//////System.out.println(Sam.RollNumber+" "+Sam.PhoneNumber+" "+Sam.Address); 
//////System.out.println(John.RollNumber+" "+John.PhoneNumber+" "+John.Address);
//////
//////}
//////
//////} 
//public class Student {
//
//
//
//   public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//
//
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The student roll number:");
//        int rollnumber = sc.nextInt();
//        System.out.println("Enter The student phone number:");
//        int phonenumber = sc.nextInt();
//        System.out.println("Enter The student address:");
//        String address = sc.nextLine();
//        sc.next();
//        
//        
//       String  Sam = new String();
//        Sam.setRollnumber( rollnumber);
//        obj.setPhonenumber( phonenumber);
//        obj.setAddress(address);
//        System.out.println("Sam Details");
//        System.out.println("Roll number :"+obj.getRollnumber);
//        System.out.println("Phonenumber :"+obj.getPhonenumber);
//        System.out.println("Address :"+obj.getAddress);
//        
//        
//        
//        
//    }
//
//
//
//}


class Student {
	public static void main(String[] args) {
		
		//String Sam = new String();
		//String John = new String();

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Sam details: ");
	String details =sc.nextLine();
	
	String Sam = new String();
	//String John = new String();
	
	System.out.print("Sam phone no:" +Sam);
	String phone =sc.nextLine();
	System.out.print("Sam Address:" +Sam);
	String address =sc.nextLine();
	System.out.print("Sam roll no:" +Sam);
	String rollno =sc.nextLine();
	sc.nextLine();
	
	String John = new String();

	Scanner sc1 = new Scanner(System.in);
	System.out.print("Enter the John details: ");
    sc1.nextLine();	
    System.out.print("John phone no:" +John);
	String phone1 =sc.nextLine();
    System.out.print("John Address:" +John);
	String address1 =sc.nextLine();
	System.out.print("John roll no:" +John);
	String rollno1 =sc.nextLine();
	

	
	}
	
}

	
//	String name = scan.nextLine();
//	System.out.print("Enter your rollno: ");
//			int roll = scan.nextInt();
//			System.out.print("Enter your section: ");
//			String Sec = scan.nextLine();
//			//System.out.println("Name is " + name);
//			System.out.println("Roll no. is " + roll);
//			System.out.println("Section is " + Sec);
//}
//}