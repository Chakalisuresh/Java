package Com.cg.Finalize;

public class TestFinalize {

		public void finalize() {
			System.out.println("Object is garbage collector");
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			TestFinalize s1 = new TestFinalize();
			
			TestFinalize s2 = new TestFinalize();
			
			s1=null;
			s2=null;
			System.gc();

	}

}
