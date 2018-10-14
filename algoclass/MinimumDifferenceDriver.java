package algoclass;

public class MinimumDifferenceDriver {
	/*
	 *The Driver class that calls MinDifference functionality  
	 * */
	public static void main(String[] args) {
		MinimumDifference minDiff =  new MinimumDifference();
		ScannerInputFromUser scanInput = new ScannerInputFromUser();
		//Send the sorted array to find out the first and second minimum differences.
		int returnValue = minDiff.minDifference(scanInput.getInputFromUser());
		//Print return value if 0
		if (returnValue < 1) {
			System.out.println("Return Value = "+returnValue);
		}

	}

}
