package sort;
import sort.PrintArrays;

public class QuickSortDriver {

	public static void main(String[] args) {
		
		int array[] = {5,2,6,1,3,4};
		QuickSort quickS = new QuickSort();
		PrintArrays print = new PrintArrays();

		System.out.println("Printing array before sorting");
		print.printArray(array);
		quickS.QuickSort(array, 0, array.length - 1);
		System.out.println("Printing array after sorting");
		print.printArray(array);

	}

}
