package loopcontrols;

public class Loops {
	
	public void forloop(int i) {
		for(int x=i;x>=0;x--) {
			System.out.println(x);
		}
	}
	
	public void whileloop(int i) {
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
	
	public void dowhile(int i) {
		do {
			i=i+1;
			System.out.println(i);
		}while(i<10);
	}
	public static void main(String[] args) {
		Loops lp=new Loops();
		System.out.println("FOR LOOP:");
		lp.forloop(10);
		System.out.println("WHILE LOOP:");
		lp.whileloop(0);
		System.out.println("DO-WHILE LOOP:");
		lp.dowhile(0);
	}

}
