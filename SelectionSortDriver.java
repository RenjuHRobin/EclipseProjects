package sort;

public class SelectionSortDriver {

	public static void main(String [] a) {
		
		int[] selectionArray = {8,4,6,9,2,3,1};
		SelectionSort slctSort =  new SelectionSort();
		PrintArrays pa = new PrintArrays();

		System.out.println("Array before Selection Sort");
		pa.printArray(selectionArray);
		
		selectionArray = slctSort.sortArray(selectionArray);
		
		System.out.println("\nArray before Selection Sort");
		pa.printArray(selectionArray);
	}
	
	 
}
