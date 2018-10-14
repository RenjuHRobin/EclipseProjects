package sort;

public class SelectionSort {


	void printArray(int[] arr) {
		for(int k = 0; k < arr.length; k++ ) {

			System.out.print("\t"+arr[k]);
		}

	}
	/*
	 * find smallest element in array
	 * exchange a[i] with the a[smallest] for each iteration of i
	 * */
	int[] sortArray(int[] arr) {

		int smallest,temp  = 0;
		int n = arr.length;

		for(int i = 0; i < n-1; i++) {
			smallest = i;

			for ( int j = i+1; j<n; j++) {
				if (arr[smallest] > arr[j]) {
					smallest = j;
				}

			}
			//exchange a-i and a-smallest
			if(i != smallest) {
			temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;

		}
		}
		return arr;	
	}

	int[] sortArray1(int[] arr) {

		int smallest,temp  = 0;
		int n = arr.length;

		for(int i = 0; i < n; i++) {
			smallest = arr[i];
			System.out.println("smallest:arr[i] \t"+smallest);
			for ( int j = i+1; j<n; j++) {
				if (smallest > arr[j]) {
					smallest = arr[j];

				}

			}
			//exchange a-i and a-smallest
			System.out.println("smallest:arr[j] \t"+smallest);
			temp = smallest;
			System.out.println("Temp \t"+temp);
			smallest = arr[i];
			arr[i] = temp;
			System.out.println("\tarr[i]"+arr[i]);

		}

		return arr;	
	}

}
