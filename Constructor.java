//write a java program in which create the multiple object and 
//display the count of number pf object created into class
public class Constructor {
    static int count;
    	
	  
     Constructor () {
         	  count++ ;
     }
	 
	
	public static void main (String [] args) {
    	System.out.println("The program is started " +count);

		Constructor cn = new Constructor();
//	int a=	cn.count;
//	System.out.println("1-object  "+a++);

	Constructor cn1 = new Constructor();
	//int  b=cn1.count;
	//System.out.println("2-object  "+a++);

	/*Constructor cn2 = new Constructor();
     int c = cn2.count;
		System.out.println("3-object  "+a++);
	
	Constructor cn3 = new Constructor();
    int d = cn3.count;
		System.out.println("4-object  "+a++);*/
	}

}
