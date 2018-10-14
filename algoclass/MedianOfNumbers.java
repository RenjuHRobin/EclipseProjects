package algoclass;
import sort.PrintArrays;
public class MedianOfNumbers {

	public int[] createCombinedArray(int[] A, int[] B) {

		PrintArrays print = new PrintArrays();
		int sizeA = A.length;
		int sizeB = B.length;
		int arrayC[] = new int[sizeA+sizeB];
		int i = 0; 
		int j = 0; 
		int k = 0;

		while (i < sizeA  && j < sizeB) {
			if(A[i] < B[j]) {
				arrayC[k] = A[i];
				i++;
				k++;

			}
			else {
				arrayC[k] = B[j];
				j++;
				k++;
			}
		}

		while (i < sizeA) {
			arrayC[k] = A[i];
			i++;
			k++;
		}
		while (j < sizeB) {
			arrayC[k] = B[j];
			j++;
			k++;
		}
		//print.printArray(arrayC);
		return (arrayC);
	}

	public void medianOfArray(int[] arrayC) {
		int sizeC = arrayC.length;
		int m1 = (sizeC - 1) / 2;
		if (sizeC % 2 == 0 ) {

			int medNum = (arrayC[m1] + arrayC[m1 +1]); 
			Double d = new Double (medNum);
			Double d2 = d / 2;
			System.out.println(d2);
		}
		else {

			System.out.println(arrayC[m1]);
		}

	}

	public int calcMedianOfArray(int[] arrayC,int size) {

		int element = (size - 1) / 2;
		if (size % 2 == 0 ) {

			int evenMedianNum = (arrayC[element] + arrayC[element +1]); 
			int evenMedianNumber = evenMedianNum / 2;
			System.out.println(arrayC[evenMedianNumber]);
			return arrayC[evenMedianNumber];

		}
		else {

			System.out.println(arrayC[element]);
			return arrayC[element];
		}

	}

}
