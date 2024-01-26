package Com.cg.InheritanceOOPSconcept2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard cc= new CreditCard();
		
		cc.cardName=53352662L;
		cc.cvv = 2435;
		cc.expDate = "23/26";
		cc.balance = 763474746;
		
		cc.swipe();
		cc.payBill();
		
		
		
		

	}

}
