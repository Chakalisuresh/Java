package Com.cg.ArrayTopic;

public class MultiplicationMatrixes {
	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4},{5,6,7,8}};
		int b[][] = {{9,10,11,12,},{13,14,15,16}};
		
		int c[][] = new int[2][4];
		
		for(int i = 0; i<4;i++) {
		  for(int j= 0; j<2;j++) {
			  c[i][j] =0;
			  for(int k = 0;k<3; k++) {
			
			  c[i][j] = a[i][j]*b[i][j];
			  }
			  
			  System.out.println(c[i][j]+"");
		  }
		  System.out.println();
		 }
	}

}
