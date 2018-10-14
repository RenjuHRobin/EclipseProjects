package sort;

public class BubbleSortDriver{

	public static void main(String[] args) {
		int[] bubbleArray = {4,2,5,9,0,1,6};
		BubbleSort bs = new BubbleSort();
		PrintArrays pa = new PrintArrays();
		System.out.println("Array before Bubble Sort");
		pa.printArray(bubbleArray);
		bs.bubbleSort(bubbleArray);

		System.out.println("\nArray after Bubble Sort");
		//printArray(bubbleArray);
	}

}
