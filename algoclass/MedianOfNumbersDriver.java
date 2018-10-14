package algoclass;

public class MedianOfNumbersDriver {

	public static void main(String[] args) {
		int arrayA[] = {1,3};
		int arrayB[] = {2,4};
		MedianOfNumbers median = new MedianOfNumbers();
		int arrayC[] = median.createCombinedArray(arrayA, arrayB);
		median.medianOfArray(arrayC);
		//median of new array

	}

}
