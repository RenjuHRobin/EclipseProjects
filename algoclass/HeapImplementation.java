package algoclass;
import sort.PrintArrays;

public class HeapImplementation {

	public void heapFunc(int array[]) {
		//System.out.println("Display Left Elements");
		//displayLeftElements(array);
		//System.out.println("Display Right Elements");
		//displayRightElements(array);
		//delete minimum element
		int size = array.length;
		array[1]= array[size-1];
		int left = 1;
		int right = size - 1;
		PrintArrays print = new PrintArrays();
		print.printArray(array);
		System.out.println("Right = "+right+"  left ="+left);
		deleteMinimumElement(array,left, right);
	}
	public void displayLeftElements(int array[]) {

		int i = 1;
		int k = 2;
		int size = array.length;
		while (k < size) {
			i++;
			System.out.println("Array["+k+"] = "+array[k]);
			k = 2 * i;

		}
	}
	public void displayRightElements(int array[]) {

		int i = 1;
		int k = 1;
		int size = array.length;
		while (k < size) {
			System.out.println("Array["+k+"] = "+array[k]);
			k = (2 * i) + 1;
			i++;

		}
	}
	public void deleteMinimumElement(int array[], int sizeLeft, int sizeRight) {
		
		
		int i = sizeLeft;
		
		
		int k = 2;
		while(k < sizeRight - 1 && i < sizeRight ) {	
			if (array[i] > array[(k)] || array[i] > array[(k) + 1] ) {
					
				//check for smaller child
				int temp = array[i];
				if(array[k] < array[k + 1]) {
					array[k/2] = array[k];
					array[k] = temp;
					//swap with smaller child
					System.out.println("Child"+array[k]+"Parent"+array[i]);
				}
				else {
					array[k/2] = array[k + 1];
					array[k + 1] = temp;
					System.out.println("Child"+array[k]+"Parent"+array[i]);
				}
				i++;
				k = 2 * i;
				
			}
			
			
		}
		
		printHeapArray(array,sizeRight);
	}
	
	public void printHeapArray(int array[],int sizeRight){
		
		for (int i = 1; i < sizeRight; i++) {
			System.out.print("\t"+array[i]);
		}
		System.out.println();
	}
}
