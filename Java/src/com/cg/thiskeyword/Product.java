package com.cg.thiskeyword;

public class Product {
	
	int price = 30;
	
	void printProdectDetails() {
		System.out.println("Product price ="+this.price+" "+"Rs");	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Product p = new Product();
		
		p.printProdectDetails();
		
		

	}

}
