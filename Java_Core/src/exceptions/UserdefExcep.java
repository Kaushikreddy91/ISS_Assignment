package exceptions;

class MyException extends Exception {
	
	public MyException(String message) {
		super(message);
	}
}


public class UserdefExcep {
	public static void main(String[] args) {
		int age=20;
		
		try {
			if(age>18) {
				throw new MyException("Above 18 is denied");
			}
		}catch(MyException ex){
			System.out.println(ex.getMessage());
		}
	}
}
