package algoclass;

import java.util.ArrayList;

public class MinHeapImplementationList {

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

	public void deleteMinimumElement(ArrayList<Integer> list) {
		int size = list.size();
		System.out.println("size"+size);
		int sizeLeft = 1;
		int sizeRight = size - 1;
		// for deleting root:set last element as root
		list.set(1, list.get(size - 1));

		// then remove the last element
		list.remove(size - 1);
		printHeapArrayList(list);

		int i = sizeLeft;
		int k = 2;
		
		/*while (k < sizeRight - 1 && i < sizeRight) {
			if (list.get(i) > list.get(k) || list.get(i) > list.get(k + 1)) {

				// check for smaller child
				int temp = list.get(i);
				if (list.get(k) < list.get(k + 1)) {
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
*/		// Here we swim the element down such that parent < both children
		swimDown(list, k, i, sizeRight);
		printHeapArrayList(list);
	}

	public void deleteElement(ArrayList<Integer> list, int node) {
		int size = list.size();
		System.out.println("Before deleting");
		printHeapArrayList(list);
		// for deleting element set last element as replacement element
		list.set(node, list.get(size - 1));
		int sizeLeft = 1;
		int sizeRight = size - 1;
		// then remove the last element
		list.remove(size - 1);
		printHeapArrayList(list);

		//int i = list.get(node);

		// Here we swim the element down such that parent < both children
		int k = 2 * node;
		// if replacement node > parent node-->swim down else swin up
		if (list.get(node) > list.get(node / 2)) {
			System.out.println("Select - Swin Down Method");
			swimDown(list, k, node, sizeRight);

		} else {
			swimUp(list,list.get(node));
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
		/*
		 * while (list.get(i) < list.get(i / 2)) { temp = list.get(i); list.set(i,
		 * list.get(i / 2)); list.set(i / 2, temp);
		 * 
		 * i = i / 2; }
		 */
		swimUp(list,i);
		System.out.println("Correct position of element:");
		printHeapArrayList(list);

	}

	public ArrayList<Integer> swimDown(ArrayList<Integer> list, int k, int i, int sizeRight) {
		while (k <= sizeRight - 1 && i < sizeRight) {
			System.out.println("hy");
			System.out.println("Parent "+list.get(i)+"  Child 1 = "+list.get(k)+"    Child 2 = "+list.get(k+1));
			
			if (list.get(i) > list.get(k) || list.get(i) > list.get(k + 1)) {

				// check for smaller child
				int temp = list.get(i);
				if (list.get(k) < list.get(k + 1)) {
					list.set(k / 2, list.get(k));
					list.set(k, temp);
					System.out.println(" Child 1 is smaller");
					System.out.println(" Child 1  = " + list.get(k) + "Parent = " + list.get(i));
					printHeapArrayList(list);
				} else {
					list.set(k / 2, list.get(k + 1));
					list.set(k + 1, temp);
					System.out.println(" Child 2 is smaller");
					System.out.println("Smaller Child = " + list.get(k + 1) + "Parent = " + list.get(i));
					printHeapArrayList(list);
				}
				

			}
			i++;
			k = 2 * i;
			
			System.out.println("Running with k = "+k+"  and i = "+i+"  and sizeRight"+sizeRight);
		}
		System.out.println("out of loop");
		return list;
	}

	public ArrayList<Integer> swimUp(ArrayList<Integer> list, int i) {
		int temp = 0;
		while (list.get(i) < list.get(i / 2)) {
			temp = list.get(i);
			list.set(i, list.get(i / 2));
			list.set(i / 2, temp);

			i = i / 2;
		}
		return list;
	}

}
