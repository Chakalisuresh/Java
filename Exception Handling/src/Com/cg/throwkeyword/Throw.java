package Com.cg.throwkeyword;

public class Throw {

	static void validate(int age) {
		
		if(age<18) {
			throw new ArithmeticException("Not elegible for vote");
		}
		
		else
			
			System.out.println("welcome to vote");
		}
	
	public static void main (String args[]) {
		
		validate(13);
		System.out.println("restof the code....");
	}
		
		
		
		

	}


