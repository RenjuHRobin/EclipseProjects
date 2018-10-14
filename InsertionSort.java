package sort;

public class InsertionSort {



	public int[] insertionSort(int[] array) {

		int key = 0;
		for (int i = 1; i < array.length; i++) {
			key = array[i];
			int j = i - 1;
			//check if 
			while(j >= 0 && key < array[j]) {
				array[j+1] = array[j];
				j = j - 1;
			}
			array[j+1] = key;
		}	


		return array;

	}

}
