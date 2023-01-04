package exceptions;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionHandling {
	
	public void unchecked_Exception() {
		int[] arr= {1,2,3,4,5};
		try {
			int k=arr[6];
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e) {     //Exception hierarchy
			System.out.println(e);
		}
		finally {          //Block of code always gets executed
			System.out.println("The code has run successfully");
		}
	}
	
	public void checked_Exception() {
	        String fileName = "file does not exist"; 
	        File file = new File(fileName);
	        try {
	            FileInputStream stream = new FileInputStream(file); 
	        } catch (FileNotFoundException e) {
	            System.out.println(e);
	            e.printStackTrace();
	        }
	        finally {          //Block of code always gets executed
				System.out.println("The code has run successfully");
			}
	    
	}

	public static void main(String[] args) {
		ExceptionHandling exc=new ExceptionHandling();
		exc.unchecked_Exception();
		exc.checked_Exception();
	}

}
