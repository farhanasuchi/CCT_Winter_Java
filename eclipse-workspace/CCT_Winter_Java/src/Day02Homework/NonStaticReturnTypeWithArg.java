package Day02Homework;

public class NonStaticReturnTypeWithArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticReturnTypeWithArg NonStaticReturnTypeWithArgobj = new NonStaticReturnTypeWithArg();
		
	  
		int result = NonStaticReturnTypeWithArgobj.myMethod3(7, 9);
		
	
	    System.out.println(result);
	   
	}

	
	
	
	
	   public int myMethod3(int a, int b)   {     //  Non static return type method with argument
		
		int c = a+b;
		
		return c;
		
			
			}	

}
