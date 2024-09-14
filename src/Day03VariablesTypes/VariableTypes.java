package Day03VariablesTypes;

public class VariableTypes {

	
	int Danyal = 5;                             //Global variable or Instance variable
	
	
	static int Eyshita = 6;                     //static variable
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int variable = 5;                        // local variable
	
	// system.out.println(variable1);
	
	
	
	System.out.println(Eyshita);
	
	
	VariableTypes obj = new VariableTypes();
	
	System.out.println(obj.Danyal);
	
	myMethod();
	
	}

	
	
	
        public static void myMethod()	{
	
	    System.out.println(Eyshita);                  //local variable
	
	   

	
		
}	
	
}
