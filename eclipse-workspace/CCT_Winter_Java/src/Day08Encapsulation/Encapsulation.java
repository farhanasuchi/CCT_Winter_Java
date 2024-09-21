package Day08Encapsulation;

public class Encapsulation {

	
	//Encapsulation is used to hide the data using setter and getter method
	
	
	
	
		private String name = "CodeCraft Tech";				//write & read 
		private int ssn = 12345678;					    	//write access
		private String username = "Bangladeshi";			//read access
		
		
		
		
		
		// Setter Method - name								//set the data, Write
		public void setName(String value){
			name = value;
		}   
		
		// Getter Method - name								//get the data, Read
		public String getName(){
			return name;
		}
		
		//Setter Method - ssn								//set the data, Write
		public void setSSN(int value){
			ssn = value;
		}
		
		
		
		//Getter Method - username							//get the data, Read
		public String getUserName(){
			return username;
		}
		
		
		
		

		public static void main(String[] args) {
			Encapsulation obj = new Encapsulation();
			
			
			
			obj.setName ("New York Residents");              // write & then read
			System.out.println(obj.getName());
			
			
			obj.setSSN(99889998);                           // write only
			
			
			System.out.println(obj.getUserName());          // read only
			
		}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
