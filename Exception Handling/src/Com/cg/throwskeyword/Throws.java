package Com.cg.throwskeyword;

public class Throws {
	
	public static void main (String args[] )throws NumberFormatException {
		
		try {
			int i = Integer.parseInt("Hello");
		}
		
		catch(NumberFormatException e) {
			 
			System.out.println("NumberFormatException:" );
		}
		
		
	}

}
