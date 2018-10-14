package algoclass;

import sort.QuickSort;
import sort.PrintArrays;

public class MedianOfSubArray {
	
	/*
	 * This method is used to obtain the longest sub array 
	 * whose median is greater than or equal to the value of X *  
	 * */
	public void medianSubArray(int [] array, int value) {

		int largestSizeofArray = 0;
		int sizeofArray = 0;
		int median = 0;
		QuickSort  quickS = new QuickSort();
		PrintArrays print = new PrintArrays();

		//sort the array using Quick sort
		quickS.QuickSort(array, 0, array.length - 1);
		System.out.println("Array Sorted");
		print.printArray(array);

		for (int i = 0; i < array.length; i++) {

			for (int j = i+1; j < array.length; j++) {

				//calculate the size of array 
				sizeofArray = calcSizeOfArray(i, j);
				//calculate median of the array
				median = calcMedianOfArray(array, sizeofArray,i);

				//Condition to set the largest size of array
				if(median >= value && sizeofArray > largestSizeofArray) {

					largestSizeofArray = sizeofArray;

				}

			}
		}
		System.out.println();
		System.out.println("Size of Longest Sub Array: "+largestSizeofArray);

	}
	
	/*
	 * This method is used to calculate the size of the sub array.
	 * The current value of i and j are passed as parameters. 
	 * 	 * *  
	 * */

	public int calcSizeOfArray(int i,int j) {
		int count = 0;
		for(int k = i; k <= j; k++) {
			count =count + 1;
		}
		return count;
	}

	/*
	 * This method is used to calculate the Median of the sub-array.
	 * The array, it's size and the current value of i are sent as parameters to the method. 
	 * *  
	 * */

	public int calcMedianOfArray(int[] arrayC,int size,int i) {

		int element = (size - 1 ) / 2;
		//find median for array with even and odd elements 
		if (size % 2 == 0 ) {

			int evenMedianNum = (arrayC[i + element] + arrayC[i + element +1]); 
			int evenMedianNumber = evenMedianNum / 2;
			return evenMedianNumber;

		}
		else {

			return arrayC[i + element];
		}

	}

}
