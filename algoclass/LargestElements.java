package algoclass;
import sort.PrintArrays;

public class LargestElements {

	public static void main(String[] args) {
		
		int largest = 0,secondLargest = 0;
		int array[] = {9,3,2,6,1,7};
		PrintArrays pa = new PrintArrays();
		
		for (int i = 0; i < array.length; i++) {
			largest = array[i];
			for (int j = 0; j < array.length; j++) {
			
				if(array[j] > largest) {
					secondLargest = largest;
					largest = array[j];
					
				}
			}
			
		}
		System.out.println("Largest Element = "+largest+  "Second Largest = "+secondLargest);
	}

}
