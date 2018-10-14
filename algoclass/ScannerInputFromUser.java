package algoclass;
import java.util.Scanner;

public class ScannerInputFromUser {
	/*
	 * This method is used to get input from user for elements in array.
	 * Input from user : No of elements 
	 *   
	 * */
	
	public int[] getInputFromUser() {
		System.out.println("Enter number of elements ");

		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		int array [] = new int [numberOfElements];
		System.out.println("Enter array elements");

		for (int i = 0; i <  numberOfElements; i++) {
			array[i] = scan.nextInt();
		}
		return (array);
	}
	

}
