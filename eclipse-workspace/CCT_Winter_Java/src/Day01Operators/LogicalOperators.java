package Day01Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	int a = 2;
	int b = 3;
	
	int c = 4;
	int d = 5;
	               //  2==3 && 2<3 && 4<=5
	boolean result1 = (a==b) && (a<b) && (c<=d);         // And Operator   ------->  at least one condition false, result false 
	
	System.out.println(result1);
	
	                 //2<=3 || 2>3 \\ 4>5
	boolean result2 = (a<b) || (a>b) || (c>d);          // Or Operator   ---------->  at least one condition true, result true
	
	System.out.println(result2);
	
                    //2>3
    boolean result3 = !(a>b);                          // Not operator   ---------->  opposite result
    
    System.out.println(result3);
	
	
	
	
	
	
	
	}

}
