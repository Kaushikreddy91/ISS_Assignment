package loopcontrols;

public class Decisioncontrol {
	
	public void ifloop(int x) {
		if(x>50) {
			System.out.println("Greater than 50");
		}else {
			System.out.println("Less than 50");
		}
	}
	
	public void switchloop(int day) {
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
	}
	public static void main(String[] args) {
		
		Decisioncontrol dc=new Decisioncontrol();
		dc.ifloop(78);
		dc.switchloop(2);
	}

}
