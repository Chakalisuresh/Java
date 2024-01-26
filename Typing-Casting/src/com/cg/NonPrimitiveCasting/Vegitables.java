package com.cg.NonPrimitiveCasting;


//UpCasting
public class Vegitables {
	
	int qty, price;
	void wash() {
		System.out.println("wash the vegetables");
				
	}
	
	void chop() {
		System.out.println("chop the vegitables");
	}
	
	class Carrot extends Vegitables{
		void PrepareHalwala() {
			System.out.println("Carrot Halwa");
			
		}
		
	class Chill extends Vegitables{
		void PrepareBajji() {
			System.out.println("Chilli Bajji");
		}
		
		
	}
	}
	

}
