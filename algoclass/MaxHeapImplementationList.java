package algoclass;

import java.util.ArrayList;

public class MaxHeapImplementationList {

	public void displayLeftElements(ArrayList<Integer> list) {

		int i = 1;
		int k = 2;
		int size = list.size();
		while (k < size) {
			i++;
			System.out.println("Array[" + k + "] = " + list.get(k));
			k = 2 * i;

		}
	}

	public void displayRightElements(ArrayList<Integer> list) {

		int i = 1;
		int k = 1;
		int size = list.size();
		while (k < size) {
			System.out.println("Array[" + k + "] = " + list.get(k));
			k = (2 * i) + 1;
			i++;

		}
	}

	public void deleteMaxElement(ArrayList<Integer> list) {
		int size = list.size();
		// for deleting root:
		// set last element as root
		list.set(1, list.get(size - 1));
		int sizeLeft = 1;
		int sizeRight = size - 1;
		// then remove the last element
		list.remove(size - 1);
		printHeapArrayList(list);

		int i = sizeLeft;

		// Here we swim the element down such that parent < both children
		int k = 2;
		while (k < sizeRight - 1 && i < sizeRight) {
			if (list.get(i) < list.get(k) || list.get(i) < list.get(k + 1)) {

				// check for larger child
				int temp = list.get(i);
				if (list.get(k) > list.get(k + 1)) {
					list.set(k / 2, list.get(k));
					list.set(k, temp);
					System.out.println("Child" + list.get(k) + "Parent" + list.get(i));
				} else {
					list.set(k / 2, list.get(k + 1));
					list.set(k + 1, temp);
					System.out.println("Child" + list.get(k + 1) + "Parent" + list.get(i));

				}
				

			}
			i++;
			k = 2 * i;

		}

		printHeapArrayList(list);
	}

	
	public void printHeapArrayList(ArrayList<Integer> list) {

		for (int i = 1; i < list.size(); i++) {
			System.out.print("\t" + list.get(i));
		}
		System.out.println();
	}

	public void insertHeapElement(ArrayList<Integer> list, int element) {
		list.add(element);
		System.out.println("After Adding element:");
		printHeapArrayList(list);
		int size = list.size();
		int i = size - 1;
		int temp = 0;
		//while parent is less than child, keep exchanging parent and child
		//get out of loop or stop when the parent is larger
		while (list.get(i) > list.get(i / 2)) {
			temp = list.get(i);
			list.set(i, list.get(i / 2));
			list.set(i / 2, temp);

			i = i / 2;
		}
		System.out.println("Correct position of element:");
		printHeapArrayList(list);

	}

}
