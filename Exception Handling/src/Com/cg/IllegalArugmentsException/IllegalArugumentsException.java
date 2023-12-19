	package Com.cg.IllegalArugmentsException;

public class IllegalArugumentsException {

	public static void print(int a) {
		 if(a>=18){
	          System.out.println("Eligible for Voting");
	          }
	          else{
	    
	          throw new IllegalArgumentException("Not Eligible for Voting");
	                                    
	          }
	       
	    }
	    public static void main(String[] args) {
	    	IllegalArugumentsException.print(20);

	}

}
