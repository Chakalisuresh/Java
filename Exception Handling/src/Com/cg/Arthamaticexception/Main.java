package Com.cg.Arthamaticexception;

/**public class ArithmeticException {

	public static void main(String[] args) {
		try {
			int a = 5;
			int b = 8;
			int c = a/b;
			System.out.println("Result:"+c);
			}
		
		catch( ArithmeticException e) {
			System.out.println("The value c is:");
			
			
		}
	}

}**/


class Main
{
    public static void main(String args[])
    {
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
    }
}