package Day02Methods;

public class Parameters {

	public static void main(String[] args) {                                         
		// TODO Auto-generated method stub
	
		myMethodwithoutparameter();    //to call a method or invoke the method
		myMethodwithparameter(4,5);
		myMethodwithparameter(4,6);
		myMethodwithparameter(4,7);
		myMethodwithparameter(4,8);
	
	}

 public static void myMethodwithoutparameter() {    // without parameter
	
         int a= 5;
	     int b= 6;
	     
	     int c= a+b;
	     
	     System.out.println(c);
	     
	     
	     
	     
	 
	 
	 
     }
	
	 public static void myMethodwithparameter(int a, int b)   {   // with parameter
	
	int c = a+b;
		 
	System.out.println(c);	 
	
	
	
     }
 


 }