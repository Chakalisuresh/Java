package com.cg.ListTpoics;

import java.util.LinkedList;

import com.cg.ListTpoics.ProductLinkedListExample1;

public class LLdemo {
	public static void main(String args[]) {
		ProductLinkedListExample1 la1 = new ProductLinkedListExample1(1200, 1, "Tshirt");
		ProductLinkedListExample1 la2 = new ProductLinkedListExample1(600, 1, "pant");
		
		LinkedList<ProductLinkedListExample1> list = new LinkedList<ProductLinkedListExample1>();
		
		list.add(la1);
		list.add(la2);
		
		
		for(ProductLinkedListExample1 Sp:list ){
			System.out.println(Sp.price+" "+Sp.qty+" "+Sp.type);
			
		}
		
		
		
		
	}

}
