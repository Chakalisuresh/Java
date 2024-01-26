package Com.cg.InheritanceOOPSconcept2;

public class Card {
	
	long cardName;
	int cvv;
	String name, expDate;
	double balance;
	
	void swipe() {
	System.out.println("swipe the card");
	}
}

class CreditCard extends Card{
	
	int creditlimit;
	void payBill(){
		
		System.out.println("Pay cardCard bill");
		
	}
}

class DebitCard extends Card{
	 int Balance;
	 
}

