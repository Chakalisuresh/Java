package Com.cg.ArrayTopic;

public class AdditionMatrixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3,},{10,20,30}};
		int b[][] = {{40,50,60},{4,5,6}};
		
		int c[][] = new int [2][3];
		for(int i = 0; i<2;i++) {
		for(int j =0; j<4;j++) {
			
			 c[i][j] = a[i][j]+b[i][j];
			 System.out.println(c[i][j]+"");
			}
		System.out.println();
		}

	}

}
