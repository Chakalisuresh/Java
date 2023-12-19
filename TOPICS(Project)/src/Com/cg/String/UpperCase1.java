package Com.cg.String;

import java.util.Locale;

public class UpperCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello string";    
        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  
        String english = s.toUpperCase(Locale.forLanguageTag("en"));
        
        System.out.println(turkish);
        System.out.println(english);  


	}

}
