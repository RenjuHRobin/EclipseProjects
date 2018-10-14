package algoclass;
import sort.InsertionSort;
import sort.PrintArrays;
public class ElementK {

	public static void main(String[] args) {
		InsertionSort insSort = new InsertionSort();
		PrintArrays printA = new PrintArrays();
		int array[] = {9,3,2,6,1,7};
		int k = 4;
		insSort.insertionSort(array);
		printA.printArray(array);
		System.out.println("\t"+array[k-1]);

	}

}
