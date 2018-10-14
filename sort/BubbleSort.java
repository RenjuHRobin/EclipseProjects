package sort;

public class BubbleSort {

	public int[] bubbleSort(int[] array) {
		int swap = 0;
		for (int i = 0; i < array.length; i++ ) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j+1]) {
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		return array;
	}

}

//