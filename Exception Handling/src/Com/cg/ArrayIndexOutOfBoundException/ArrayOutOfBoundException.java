package Com.cg.ArrayIndexOutOfBoundException;

public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		try{
            int a[] = new int[5];
            a[6] =1; 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }

	}

}
