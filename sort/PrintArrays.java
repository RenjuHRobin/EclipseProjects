package sort;

public class PrintArrays {
	/*
	 * This method prints all elements in the array 
	 *   
	 * */
	public static void printArray(int[] array) {
		
		System.out.println("Array Elements are :    ");
		for(int k = 0; k < array.length; k++ ) {
			
			System.out.print("\t"+array[k]);
		}

		System.out.println();
	}

}
