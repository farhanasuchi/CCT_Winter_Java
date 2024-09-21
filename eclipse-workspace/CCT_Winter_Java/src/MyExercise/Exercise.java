package MyExercise;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	int result = myMethod (5,8)	;
		
	System.out.println (result)	;

	
	
	double result1 =myMethod1  (9.9, 5);
	
	System.out.println(result1);
	
	
	
	
   double result2 = (result  * result1) ;
	
	System.out.println(result2);
	
	
	
	
}	

	
public static int myMethod (   int a, int b)	{
	
	int c =  a*b;

	
	return c;
	
	
}






public static double myMethod1 (double x, int y) {
	
double z =x-y;	
	
	
return z;	
	
	
}
}

