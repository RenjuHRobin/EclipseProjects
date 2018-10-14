package sort;

public class MergeSort {

	/*
	 * This method is called recursively to sort the all array elements.
	 * It also calls the merge method after the recursive calls are completed for specific operation
	 * */
	public void mergeSort(int [] array, int left, int right) {


		if(left < right) {
			int mid = (left +  right )/ 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid+1, right);
			merge(array,left,mid,right);
		}
	}

	/*
	 * This method is called recursively to sort the all array elements.
	 * It also calls the merge method after the recursive calls are completed for specific operation
	 * */
	public void merge(int [] array, int left, int mid, int right ) {

		//n1 - size of Left Array 
		//n2 - size of Right Array
		int n1 = mid - left   + 1;
		int n2 = right - mid;
		//Create two arrays Left and Right with n1 and n2 sizes respectively
		int Left [] = new int [n1];
		int Right [] = new int [n2];

		//populate Left and Right arrays with elements from the original array with restrictions n1 & n2  
		for (int i = 0; i < n1; i++) {
			Left[i] = array[ i + left];
		}
		for (int j = 0; j < n2; j++) {
			Right[j] = array[ j + mid + 1];
		}

		int i = 0;
		int j = 0;
		int k = left;

		//Values from Left and Right arrays are compared. Array is sorted. 
		while( i < n1 && j < n2) {

			if (Left[i] < Right[j]) {
				array[k] = Left[i];
				i++;
				k++;
			}
			else {
				array[k] = Right[j];
				j++;
				k++;
			}

		}

		//Put remaining values from Left and Right arrays in the original array.
		while (i < n1) {
			array[k] = Left[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = Right[j];
			j++;
			k++;
		}
	}

	/*
	 * This method prints array elements. 
	 * 
	 * */

	public void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print("\t"+arr[i]);
		}
		System.out.println();
	}
}
