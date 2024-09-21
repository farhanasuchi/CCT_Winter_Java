package Day09Collections;

import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 1.doesn't maintain sequence / order
		 * 2. doesn't allow the duplicate value.
		 * 
		 * 
		 */
		
		
		
	   String st1 = "Queens";
	   String st2 = "Manhattan";
	   String st3 = "Brooklyn";
	   String st4 = "Bronx";
	   String st5= "Staten island";
	   String st6 = "Bronx";	
			
	   HashSet  <String> set =  new HashSet <String> ();
				
		
		
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(st4);
		set.add(st5);
		
		
		int len = set.size();
		
		System.out.println(len);
		
	
	   set.remove(st6);
		
		
		
		
		for (String s : set) {      // for each loop
			
			System.out.println(s);
				
			
		}
		
		
		
		
		
		
	}

}
