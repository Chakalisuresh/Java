package Com.cg.Finally;

public class TestFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			 int x = 25;
			int y = 5;
			
			int c = x/y;
			
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		finally {
			System.out.println("finally block is executed");
		}

	}

}
