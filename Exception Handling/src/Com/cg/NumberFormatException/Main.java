package Com.cg.NumberFormatException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num = Integer.parseInt("Akki");
			System.out.println("num");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
			
		}

	}

}
