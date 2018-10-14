package sort;

public class SelectionSort_old
{

	public static void main(String[] args) {

		int smallest  = 0,temp;
		int [] array = {8,4,6,9,2,3,1};
		int n = array.length;
		
		//System.out.println("Elements of the array are: ");
		for(int k = 0; k < n; k++ ) {
			
			//System.out.print("\t"+array[k]);
		}
		
		for(int i = 0; i < n; i++) {
			smallest = i;
			for ( int j = i+1; j<n; j++) {
				if (array[smallest] > array[j]) {
					smallest = j;
				}
				
			}
			//exchange a-i and a-smallest
			temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
			
		}
		System.out.println();
		System.out.println("Array after sort");
for(int k = 0; k < n; k++ ) {
			
			System.out.print("\t"+array[k]);
		}

	}

}
