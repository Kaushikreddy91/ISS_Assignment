package Strings_Arrays;
import java.util.Arrays;

public class Arrayex {

	public static void main(String[] args) {
		int[] arr= {6,2,8,1,3};
		int[] arr2= {1,2,3,4};
		int[] arr3= new int[2];
		String[] strArr=new String[3];
		strArr[0]="Cat";
		strArr[1]="Water";
		strArr[2]="Sheep";
		
		//Sorting the array
		Arrays.sort(arr);
		System.out.println("Sorted Array: "+ Arrays.toString(arr));
		
		//To check if Arrays are equal
		System.out.println("To check Equal or not:" +Arrays.equals(arr,arr2));
		
		//To fill array with a integer
		Arrays.fill(arr3,99);
		System.out.println("New Array arr3: "+ Arrays.toString(arr3));
		

	}

}
