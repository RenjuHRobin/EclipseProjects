package sort;

public class MergeSortDriver {

	public static void main(String[] args) {
		int array[] = {2,1,6,3,5};
		int left = 0;
		int right = array.length - 1;
		MergeSort mrgSrt =  new MergeSort();
		mrgSrt.printArray(array);
		mrgSrt.mergeSort(array, left, right);
		mrgSrt.printArray(array);
	}

}
