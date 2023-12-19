package com.cg.functionalinterfacewrtinheretances;

//case one

@FunctionalInterface
 interface P {
	 
	 public void m1();

}
@FunctionalInterface
interface C extends P
{
	
	
}


//case two
//
//@FunctionalInterface
// interface P {
//	 
//	 public void m1();
//
//}
//@FunctionalInterface
//interface C extends P
//{
//	public void m1();
//	
//}

//case three

//
//@FunctionalInterface
// interface P {
//	 
//	 public void m1();
//
//}
//@FunctionalInterface
//interface C extends P
//{
//	public void m2();
//	
//}

//

// case four
//
//@FunctionalInterface
//interface P {
//	 
//	 public void m1();
//
//}
//
//interface C extends P
//{
//	public void m2();
//	
//}
