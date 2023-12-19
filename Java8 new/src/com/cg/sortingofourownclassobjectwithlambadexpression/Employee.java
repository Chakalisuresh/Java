package com.cg.sortingofourownclassobjectwithlambadexpression;

import java.util.ArrayList;
import java.util.Collections;

//case 1
//class Employee {
//	int eno;
//	String ename;
//	Employee(int eno, String ename) {
//		this.eno=eno;
//		this.ename=ename;
//	}
//	public String toString() {
//		return eno+":"+ename;
//	}
//}
//
//class Test{
//	
//	public static void main(String[] args) {
//		
//		Employee emp = new Employee(100, "suri");
//		System.out.println(emp);
//	}
//}


///case 2
class Employee {
	int eno;
	String ename;
	Employee(int eno, String ename) {
		this.eno=eno;
		this.ename=ename;
	}
	public String toString() {
		return eno+":"+ename;
	}
}

class Test{
	
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(100, "Suri"));
		emp.add(new Employee(300, "Hari"));
		emp.add(new Employee(400, "Subbu"));
		emp.add(new Employee(500, "Ravi"));
		
		
		System.out.println(emp);
		Collections.sort(emp,(emp1,emp2)->(emp1.eno>emp2.eno)?-1:(emp1.eno<emp2.eno)?1:0);
		System.out.println(emp);
		
		
	}
}


