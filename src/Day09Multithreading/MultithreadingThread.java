package Day09Multithreading;

public class MultithreadingThread extends Thread {
	
	public void run(){
		try{
			System.out.println("Thread from Thread Class " + Thread.currentThread().getId() + " is running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}

}
