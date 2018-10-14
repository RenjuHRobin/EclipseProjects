package algoclass;

import java.util.ArrayList;

public class MaxHeapImplementationDriver {

	public static void main(String[] args) {
		int element = 20;
		MaxHeapImplementationList heapImplList = new MaxHeapImplementationList();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(100);
		list.add(19);
		list.add(36);
		list.add(17);
		list.add(3);
		list.add(25);
		list.add(1);
		list.add(2);
		list.add(7);
		heapImplList.printHeapArrayList(list);
		
		//heapImplList.insertHeapElement(list, element);
		heapImplList.deleteMaxElement(list);
		
	}

}
