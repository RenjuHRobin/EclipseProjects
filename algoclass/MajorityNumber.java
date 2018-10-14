package algoclass;

public class MajorityNumber {

	public void findMajNumber(int[] A,int[]C) {
		for (int i = 0; i < C.length; i++) {

			C[A[i]] = C[A[i]] + 1;

		}

		printArray(C);
		checkForMajorityElement(C);
	}


	public void checkForMajorityElement(int[] C) {
		boolean majority = false;
		for (int k = 0; k < C.length; k++) {

			if(C[k] > (C.length / 2)) {
				System.out.println("Majority Element = "+k);
				majority =true;
			}
		}
		if (majority  == false) {
			System.out.println("Majority Element not found");
		}
	}
	
	public void printArray(int[] array) {
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

	}
	
	public int findGreatestElement(int[] array) {
		
		int greatest = 0;
		for (int i = 0; i < array.length; i++) {
			greatest = array[i];
			
			for (int j = 0; j < array.length; j++) {
				
				if (array[j] > greatest ) {
					greatest = array[j];
				}
			}
			
			
		}
		return greatest;
	}

}
