package Com.cg.String;

public class ConcatExampel3 {

	public static void main(String[] args) {


		    String str1 = "Chakali";  
	        String str2 = "Suresh";  
	        String str3 = "Suri";  
	        
	        String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);  
	        System.out.println(str4);         

       
	        String str5 = str1.concat("!!!");  
	        System.out.println(str5);  
	        
	        String str6 = str1.concat("@").concat(str2);  
	        System.out.println(str6);  

	}

}
