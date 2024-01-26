package Com.cg.PolyporphismOOPSconcept;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car C1 = new Car();
		Boat B1 = new Boat();
		Bycycle Bc1 =new Bycycle();
		
		//C1.go();
		//B1.go();
		//Bc1.go();
		
		
		Vechical r1[] = new Vechical[3];//Declaration
		r1[0] = C1;//Intlization
		r1[1] = B1;
		r1[2] = Bc1;
		for(Vechical x:r1) {
			x.go();
			
			
		}

	}

}
