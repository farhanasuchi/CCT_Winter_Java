package Day06Inheritance;

public class ChildWithVariable extends ParentWithVariable {

	public static void main(String[] args) {
		

		
		
		
	 ParentWithVariable obj = new ParentWithVariable(3,0);
		
	   int result1 = obj.x;
		
	   int result2 = obj.y;
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
		
		public ChildWithVariable (int p, int q) {
		
		
		super (p,q);
		
		
		
		
			
		
	}

}
