package algoclass;

public class MajorityNumberDriver {

	public static void main(String[] args) {
		int A[] = {5,3,2,3,3,5,3};
		MajorityNumber majNum =  new MajorityNumber();
		int C[] = new int[A.length];
		//majNum.findGreatestElement(A)
		for (int i = 0; i < C.length; i++) {
			C[i] = 0;
		}
		majNum.printArray(C);		
		majNum.findMajNumber(A, C);
		
	}	
}