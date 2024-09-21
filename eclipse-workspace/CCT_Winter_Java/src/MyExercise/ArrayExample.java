package MyExercise;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
	String [] arr = { "car", "bus", "truck", "bike" };	//string(" ")
		
		
		int l = arr.length;
		
	
		
		for (int i=0; i<l; i++) {     //not(=) so no (-1)
		
		
		System.out.println(arr[i]);
	
		
		
		}	
	
		for(int i=l-1; i>=0; i--) {    //for = (-1)   & >=0
		
		System.out.println(arr[i]);
		
		
		
		}
		
		

		int [] starr = {5,6,7,8,9};  //int so no (" ")
		
		
		int r = arr.length;
		
		
		for (int i = 0; i<r; i++) {  //not(=) so no (-1)
		
		System.out.println(starr[i]);
				
		

		
		}
		
		
		for (int i=r-1; i>=0; i--) {     // //for = (-1)   & >=0
		
		System.out.println(starr[i]);
		
		
		
		
		}	
		
	
		
		
	}

}
