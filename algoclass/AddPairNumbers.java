package algoclass;

public class AddPairNumbers {

	public void addPairNums(int [] array,int x) {
		int sum = 0;
		for ( int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j <= array.length - 1; j++ ) {
				sum = array[i] + array[j];

				if(sum == x) {
					System.out.println("["+i+","+j+"]");
					i = array.length-1;
					j = array.length-1;
				}

			}

		}
	}
}
