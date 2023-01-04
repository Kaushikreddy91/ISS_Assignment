package multithreading;
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors; 

class SingleThreads implements Runnable {  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" Started ");  
        processmessage();  
        System.out.println(Thread.currentThread().getName()+" Finished"); 
    }  
    private void processmessage() {  
        try {  
        	Thread.sleep(2000);
        } catch (InterruptedException e) { 
        	e.printStackTrace(); 
        }  
    }  
}  

public class Threadpools {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new SingleThreads();  
            executor.execute(worker);
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
        System.out.println("Program completed");  
	}
}
