package algoclass;

import java.util.ArrayList;

public class MinHeapImplementationListDriver {

	public static void main(String[] args) {

		MinHeapImplementationList heapImplList = new MinHeapImplementationList();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(11);
		list.add(8);
		list.add(15);
		list.add(17);
		list.add(21);
		int element = 3;
		int node = 2;
		//heapImplList.displayLeftElements(list);
		//heapImplList.displayRightElements(list);
		heapImplList.deleteMinimumElement(list);
		//heapImplList.insertHeapElement(list, element);
		//heapImplList.deleteElement(list, node);
		

	}

}
