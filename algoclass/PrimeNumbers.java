package algoclass;

public class PrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		int n = 6;
		if (n<2){
			System.out.println("Not a prime number");
		}
		else {
			count = 1;
		}
		
		for (int i = 3; i < n; i++) {// checks for each no
			boolean isNotPrime = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isNotPrime = true;
					break;
				}
			}
			if(!isNotPrime) {
			count++;	
			}
		}
		System.out.println(count);

	}

}
