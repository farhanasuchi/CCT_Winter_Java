package Day09Collections;

import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	  HashMap <String, Integer >	 map = new HashMap < String , Integer > ();
		
	  map.put("Farhana", 101 );
	  map.put("Eyshita", 102);
	  map.put("Sabrina", 103);
	  map.put("Hasan", 104);	
		
		
		
	   int val = map.get("Eyshita");	
		
		System.out.println(val);
		
		
		
	}

}
