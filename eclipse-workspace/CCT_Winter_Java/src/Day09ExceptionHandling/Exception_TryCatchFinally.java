package Day09ExceptionHandling;

public class Exception_TryCatchFinally {

	
	
	
	public static void main(String[] args) {
		/* Java Exceptions - Use "try - catch - finally"
		  
			A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations
				 1. ArithmeticException - error has occurred in an arithmetic operation.
				 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.
				 3. ClassNotFoundException - try to access a class whose definition is not found
				 4. FileNotFoundException - a file is not accessible or does not open.
				 5. IOException - input-output operation failed or interrupted
				 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
				 7. NoSuchFieldException - class does not contain the field or variable specified
				 8. NoSuchMethodException - accessing a method which is not found
				 9. NullPointerException - referring to the members of a null object
				 10. NumberFormatException  -  a method could not convert a string into a numeric format
				 11. RuntimeException - any exception which occurs during runtime.
				 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
			
			B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
		*/
		
		
		
		
		
		
		
		try {   
		int [] age = {25,35,28,42,50};
		System.out.println("age : " + age[6]);
		}
		
		
		
		catch(Exception e) {
			e.printStackTrace();   // to print details about the exception in the console
			System.out.println("Please check the array Index");
		}
		
		
		
		
		
		
		try {  // built in exception
		int num = Integer.parseInt("CodeCraftTech");
		System.out.println("Integer Number : " + num);
		}
		
		
		catch(Exception e) {
			e.printStackTrace();   // to print details about the exception in the console
			System.out.println("Please check the number parse");
		}
		
		
		
		
		
		try {  // specific built in exception
			int num = Integer.parseInt("CodeCraftTech");
			System.out.println("Integer Number : " + num);
			}catch(NumberFormatException e) {
				e.printStackTrace();   // to print details about the exception in the console
				System.out.println("Please check the number parse");
			}
		
		
		
		
		
		try {  // user defined
			throw new MyException("Test");
		} 
		
		
		catch (Exception e) {
			e.printStackTrace();   // to print details about the exception in the console
			System.out.println("This is user defined exception");
		}
		
		
		
		
		
		finally {
			System.out.println("Test is Completed");
		}
		
	}

}
