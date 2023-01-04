package multithreading;


class product{
	synchronized void product(int n) {
		int prod=1;
		for(int i=1;i<5;i++) {
			prod =n*prod;
			System.out.println(prod);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class thread1 extends Thread {
	product p;
	thread1(product p){
		this.p=p;
	}
	public void run() {
		p.product(4);
	}
}
class thread2 extends Thread {
	product p;
	thread2(product p){
		this.p=p;
	}
	public void run() {
		p.product(6);
	}
}

public class Method_Synchronization {

	public static void main(String[] args) {
		product p=new product();
		thread1 t1=new thread1(p);
		thread2 t2=new thread2(p);
		
		t1.start();
		t2.start();
	}

}
