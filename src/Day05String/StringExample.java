package Day05String;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	String st1 = "CodeCraft Tech";     // String literal        // String pool
	
	String st2 = new String ("CodeCraft Tech");     // String Object      // String heap
	
	
	
	String value = "United states";
    String value1 = "United states";
    
	int elements = value.length();     // length method
	System.out.println(elements);        // elements number

	
	
	
	char c = value.charAt(0);         // charAt method         // // index number 

	System.out.println(c);

	
	
	char LastIndex = value.charAt(elements - 1);            

	System.out.println(LastIndex);

	
	
	String result1 = value.substring(7);         // subString method

	System.out.println(result1);

	
	
	String result2 = value.substring(2, 5);

	System.out.println(result2);

	
	
	
	boolean  b = value.equals(value1);            // equals method
	
	System.out.println(b);
	
	
	
	
	boolean b1 = st1.equals(st2);
	System.out.println(b1);
	
	
	
	boolean b2 = st1 == st2;
	System.out.println(b2);
	
	
	
	
	
	}

}
