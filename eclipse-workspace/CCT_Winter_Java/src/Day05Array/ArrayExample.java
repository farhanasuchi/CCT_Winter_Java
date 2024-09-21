package Day05Array;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int v1 = 5;
	int v2 = 6;
	int v3 = 7; 
	int v4 = 8;
	int v5 = 9;
		
		
	//int [] arr new int [5];	
		
	// arr [0] = 5;
	//arr [1] = 6;
	//arr [2] = 7;
	//arr [3] = 8;
	//arr[4] = 9;
		
		
	int []arr = {5,6,7,8,9};	
		
	String []starr 	 = {"Farhana" , "Danyal" , "Sabrina" , "Eyshita"  };
		
		
		
		int l = arr.length;                // not  need 
		
		System.out.println(l);
		
		
		for (int i = 0;  i<=l-1; i++) {     // another way (int = 0; i<= arr.length -1 ;  i++)
		
		System.out.println(arr[i]);
		
			}	
	
		
		
		for (int i = 0;  i <=starr.length-1;  i++   ) {
		
        System.out.println(starr[i]);
		
		}	
	
		
		for (int  i = starr.length-1; i>=0; i--) {
		
		System.out.println(starr[i]);
			
				
			
		}	
		
	}

}
