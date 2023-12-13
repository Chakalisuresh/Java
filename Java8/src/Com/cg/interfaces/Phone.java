package Com.cg.interfaces;

public interface Phone {
	void call();
  default void Message() {
System.out.println("Sent");
		
}
}
 class AndriodPhone implements Phone {
	 public void call() {
		 System.out.println("Calling");
	 }


}
