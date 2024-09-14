package Day02Methods;

public class StaticAndNonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		myMethod1(2,1);
		
		StaticAndNonstatic StaticAndNonstaticobj = new StaticAndNonstatic();
		StaticAndNonstaticobj.myMethod2(2, 2);
		
		StaticAndNonstaticobj.myMethod3(2, 0);
	
	}

	
	
	
	
    public static void myMethod1(int a, int b)	{     //static method
	
	int c = a + b;
	
	System.out.println(c);
	
    }
	
	
	
    public  void myMethod2(int a, int b)	{     // non static 
    	
    	int c = a + b;
    	
    	System.out.println(c);
    	
        }
	
	
	
 public  void myMethod3(int a, int b)	{     // non static 
    	
    	int c = a + b;
    	
    	System.out.println(c);
    	
	
 }
	
	
}	
	
	
