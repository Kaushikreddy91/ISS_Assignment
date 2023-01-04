package multithreading;

class products{
	public void multiply(int n) {
		synchronized(this) {
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
}

class thread3 extends Thread {
	products p;
	thread3(products p){
		this.p=p;
	}
	public void run() {
		p.multiply(4);
	}
}
class thread4 extends Thread {
	products p;
	thread4(products p){
		this.p=p;
	}
	public void run() {
		p.multiply(6);
	}
}


public class Block_Synchronization {
	public static void main(String[] args) {
		products p=new products();
		thread3 t3=new thread3(p);
		thread4 t4=new thread4(p);
		
		t3.start();
		t4.start();
	}

}
