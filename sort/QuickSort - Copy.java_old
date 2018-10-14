package sort;


public class QuickSort {

	/*
	 * This method gets pivot element and calls itself recursively to obtain the final sorted array. 
	 *   
	 * */
	public void QuickSort(int[] array, int low, int high) {


		if(low < high) {
			int pivot = partitionQuickSort(array, low, high);
			QuickSort(array, low, pivot - 1);
			QuickSort(array, pivot + 1, high);
		}


	}
	/*
	 * This method returns the pivot element.
	 * Parameters in elements--> the array, low and high values  
	 *   
	 * */

	public int partitionQuickSort(int[] array, int low, int high) {

		int x = array[high];
		int i = low - 1;
		int exchInner = 0; int exchOuter = 0;

		for (int j = low; j <= high-1; j++) {

			if( array[j] < x) {
				i = i + 1;

				exchInner = array[i];
				array[i] = array[j];
				array[j] = exchInner;

			}

		}


		exchOuter = array[i+1];
		array[i+1] = array[high];
		array[high] = exchOuter; 
		return i + 1;
	}

}
