package multithreading;

class Runnableclass implements Runnable {
	public Thread t;
	   public void run() {
	      try {
	    	  System.out.println("Running thread by Runnable class" );
	      } catch (Exception e) {
	         System.out.println("Thread interrupted." + e);
	      }
	   }
	   public void start() {
		   t.start();
	   }   
}

class Threadclass extends Thread {
	   public void run() {
	      try {
	    	  System.out.println("Running thread by Thread class");
	      } catch (Exception e) {
	         System.out.println("Thread interrupted."+ e);
	      }
	   }
	   
}

public class threads_program {
	public static void main(String[] args) {
		
		Runnableclass R=new Runnableclass();
		Thread t=new Thread(R);
		t.start();
		
		Threadclass T=new Threadclass();
		T.start();

	}

}
