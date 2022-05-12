
public class NonStatic4 {

	public static void main (String []args) {
		NonStatic4 ns4 = new NonStatic4 ( );
	int z=	ns4.multi (9,30);
	
	System.out.println("The multiplication of two number is :" + z);
		
		
	}
	
	public int multi (int a , int b) {
		
	
		
		int c =a*b;
		return c ;
	}
	

}

