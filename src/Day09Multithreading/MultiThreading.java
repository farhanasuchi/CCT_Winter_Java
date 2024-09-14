package Day09Multithreading;

public class MultiThreading {

	
	
	
	  /* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
		Threads can be created by using two mechanisms : 

			1. Extending the Thread class 
			2. Implementing the Runnable Interface */
		
		
		

		public static void main(String[] args) {
			
			int n =4;
			for (int i =0; i< n; i++){
				MultithreadingThread MultithreadingThreadObj = new MultithreadingThread(); // Extending the Thread class
				MultithreadingThreadObj.start();	
			}
			
			
			
			int m = 4;
			for (int i =0; i< m; i++){
				Thread ThreadObj = new Thread(new MultithreadingRunnable()); // Implementing the Runnable Interface
				ThreadObj.start();
			}
		}

		}
	  

