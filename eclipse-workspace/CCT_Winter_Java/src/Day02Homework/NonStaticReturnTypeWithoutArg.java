package Day02Homework;

public class NonStaticReturnTypeWithoutArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		NonStaticReturnTypeWithoutArg methodobj = new NonStaticReturnTypeWithoutArg();
	
	    int result = methodobj.myMethod4(); 
	
	    System.out.println(result);
	
	
	}

	
	    public int myMethod4()  {            // Non static return type method without argument
		
	    int a = 7;
		int b = 5;
		
		int c = a-b;
		
		
		return c;
		
		
		}	
		
	
}
