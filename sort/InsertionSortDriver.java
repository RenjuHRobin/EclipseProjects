package sort;

public class InsertionSortDriver {

	public static void main(String[] args) {

		int[] insertionSortArray = {26,2,10,5,1,25,85,93,10000,0,64,46,82,27};
		InsertionSort insSort = new InsertionSort();
		int k = 2;
		PrintArrays pa = new PrintArrays();

		System.out.println("Array before Insertion Sort");
		pa.printArray(insertionSortArray);

		insSort.insertionSort(insertionSortArray);

		System.out.println("\nArray after Insertion Sort");
		pa.printArray(insertionSortArray);
		System.out.println();
		System.out.println(insertionSortArray[k-1]);


	}

}
