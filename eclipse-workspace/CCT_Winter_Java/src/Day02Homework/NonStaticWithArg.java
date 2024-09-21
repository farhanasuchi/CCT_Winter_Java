package Day02Homework;

public class NonStaticWithArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		NonStaticWithArg Nonstaticobj = new NonStaticWithArg();	
		
		Nonstaticobj.myMethod1(20, 10);
		
	}
		
		
		

	
	   public void myMethod1(int x, int y) {    //     Non static method with argument
	
		int z = x-y;
		
		
		System.out.println(z);
				
		
		}
	
	
	
	
}
