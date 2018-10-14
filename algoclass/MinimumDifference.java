package algoclass;
import sort.QuickSort;
import sort.PrintArrays;


import sort.PrintArrays;
import sort.QuickSort;

public class MinimumDifference {
	/*
	 * This method is used to calculate the minimum differences between array elements 
	 * */
	public int minDifference(int[] array) {

		int i = 0;
		int j = 1;
		int firstMinimum = 0;
		int secondMinimum = 0;
		int temp = 0;
		int x = 0; boolean isMinFound = false;
		int y = 0;
		int count = 0;
		
		//firstMinimum - the least difference between array elements
		//secondMinimun - the next difference after first minimum
		int left = 0;
		int right = array.length - 1;
		
		QuickSort quickS =  new QuickSort();
		PrintArrays print = new PrintArrays();
		//Sort all elements in the array
		quickS.QuickSort(array, left, right);
		print.printArray(array);
		
		if(array.length < 2 ) {
			System.out.println("Array has less than two elements");
			return 0;
		}


		while (i < array.length - 1 && j < array.length ) {

			secondMinimum  = array[j] - array[i];
			//For first element
			if(temp == 0) {
				firstMinimum = secondMinimum;
				x = i;
			}

			else if(secondMinimum < temp ) {
				firstMinimum = secondMinimum;
				x  =  i;
				isMinFound = true;
			}
			else {
				count = count + 1;
				if(!isMinFound) 
				{
					y = i;
					isMinFound = true;

				}
			}

			temp = secondMinimum;
			i++;
			j++;
		}
		System.out.println();
		System.out.println("First Minimum: "+firstMinimum+" ["+array[x]+","+array[(x+1)]+"]");
		System.out.println("Second Minimum: "+secondMinimum+" ["+array[(y)]+","+array[(y+1)]+"]");
		return 1;

	}
}
