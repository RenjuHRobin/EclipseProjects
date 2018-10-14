package algoclass;

public class ConversionOfInput {

	public static void main(String[] args) {
	String Alpha[] = {"","A","B","C"};
	int digits[] = {1,2,1};
	conversionDigits(Alpha,digits);
	
	}
	
	public static void conversionDigits(String[] Alpha, int[] digits) {
		boolean isPresent = false;
		int count = 0;
		
		for (int  i = 0; i < digits.length; i++) {
			System.out.println("i = "+i);
			
			if (digits[i] >= Alpha.length) {
				System.out.println("Number not in range");
				isPresent = false;
				i = digits.length;
			}
			else {
				isPresent = true;
			}
		}
		
		if(isPresent) {
			count++;
		}
		
		System.out.println("Count = "+count+" isPresent = "+isPresent);
		
		//
		int number = 121;
		
		
		
		
	}
	
	

}
