package algoclass;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class MedianOfSubArrayDriver {

	public static void main(String[] args) {
		/*
		 * Call medianSubArray method to find longest sub array whose median is equal to or greater than input value
		 * */
		Scanner scan =  new Scanner(System.in);
		//Give value for X:
		System.out.println("Enter X :");
		
		int inputValue = scan.nextInt();
		ScannerInputFromUser scanInput = new ScannerInputFromUser();
		MedianOfSubArray medianSA = new MedianOfSubArray();
		medianSA.medianSubArray(scanInput.getInputFromUser(), inputValue);


	}

}
