package Day09Collections;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * 1.maintains the sequence / order.
 * 2.allows duplicate values.
 * 
 * 
 * 
 * 
 */
    String st1 = "Queens";
    String st2 = "Manhattan";
	String st3 = "Brooklyn";
	String st4 = "Bronx";
	String st5= "Staten island";
	String st6 = "Bronx";
	
	ArrayList  <String> list =  new ArrayList <String> ();
	
	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
	list.add(st5);
	list.add(st6);
	
	int len  = list.size();
	System.out.println(len);
	
	
	String val = list.get(2);
	System.out.println(val);
	
	
	list.remove(st6);    //
	int l = list.size();
	
	System.out.println(l);
	
	
	for (String s : list) {      // for each loop
		
		System.out.println(s);
			
		
	}
	
	
	
	/* wrapper class: a class that wraps multiple primitive data.Thare are 8 wrapper classes available in java.
	 * 
	 * 1.Used for autoboxing, unboxing.
	 * 2.used for data conversion.
	 * 3.used for exception handling.
	 *  
	 * 
	 */
	
	
	//int n1 = 5;
	//int n2 = 6;
	//int n3 = 7;
	
	
	//ArrayList <Integer> numList = new ArrayList <Integer> ();
	
	
	
	
	 }
	  }


