package com.cg.NonPrimitiveCasting;

public class Engineer2 {//Upcasting
	
	void work() {
		System.out.println("Engineer works");
	}

}

 class SoftwareEngineer extends Engineer2{
	
	void work() {
		
		System.out.println("Software engineer woks");
		
	}
	
}

 
 class ElectricalEngineer extends Engineer2{
	 void work() {
		 System.out.println("Electrical engineer works");
	 }
 }
 
 class CivalEngineer extends Engineer2{
	 void work() {
		 System.out.println("Cival engineer works");
	 }
 }