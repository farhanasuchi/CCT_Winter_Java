package Day02Homework;

public class NonStaticWithoutArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NonStaticWithoutArg NonStaticWithoutArgobj = new NonStaticWithoutArg();
		
		NonStaticWithoutArgobj.mymethod2();
		
	}
	
	
	
	    public void mymethod2() {              //    Non static method without argument
		int x = 8;
		int y = 5;
		
		int z = x-y;
	
	    System.out.println(z);
	
	
	}
}
