package Day02Methods;

public class VoidAndReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myMethod01(1,2);       // void
		
  
        int result = myMethod02(2,2);
                                               //return
        System.out.println(result);
  
  
			}

	
	
public static void myMethod01(int a, int b) { 	// void method

  int c = a+b;
	
	System.out.println(c);
	
	}

  public static int myMethod02(int a, int b) {   //return type method
	
	int c= a+b;
	
	return c;
	
}

	
}
