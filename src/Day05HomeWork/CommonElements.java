package Day05HomeWork;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int [] arr1 = {5,6,7,8,9};
	
	int [] arr2 = {5,4,7,2,9};
	
	int [] arr3 = {5,6,8,2,0}; 
	
	
	
	int l1 = arr1.length;
	
	int l2 = arr2.length;
	
	int l3 = arr3.length;
	
	
	
	for (int i=0; i<l1; i++) {
		
		
	
			for (int j=0; j<l2; j++) {
				
				
	
					for (int k=0; k<l3; k++) {
	
		
								if (  (arr1[i] == arr2[j])  &&  (arr3[k] == arr1[i])  ) {
		
		
														System.out.println(arr1[i]);
		 
		
		
														}	
								
							
		
		
											}
	
									}
			
								}
	
	
	
	
	
	
	}

}
