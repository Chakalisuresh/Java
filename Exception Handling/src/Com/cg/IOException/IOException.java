package Com.cg.IOException;

import java.util.Scanner;

public class IOException {

	public static void main(String[] args) {

		Scanner sc = new Scanner("Hello Suri");
		 
        System.out.println("" + sc.nextLine());
        System.out.println("Exception Output: " + sc.ioException());
 
        sc.close();
	}

}
