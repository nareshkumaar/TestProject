package com.test.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/*LinkedList is a doubly-linked list implementation of the List and Deque interfaces. 
 LinkedList allows for constant-time insertions or removals using iterators, 
 but only sequential access of elements. 
 In other words, LinkedList can be searched forward and backward 
 but the time it takes to traverse the list is directly proportional to the size of the list.*/

public class LinkedListExample {

	int number;

	public LinkedListExample(int number) {
		this.number = number;
	}

	public static void main(String[] args) {
		linkedListExample1();
		linkedListExample2();
	}

	public static void linkedListExample1() {
		LinkedList<String> linkedlist = new LinkedList<String>();

		/*
		 * add(String Element) is used for adding the elements to the linked
		 * list
		 */
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		linkedlist.add("Rajesh");

		/* Display Linked List Content */
		System.out.println("Linked List Content: " + linkedlist);

		linkedlist.addFirst("Arjun");
		linkedlist.addLast("Naresh");

		System.out.println("Linked List Content after " + linkedlist);

		/* This is how to get and set Values */
		Object firstvar = linkedlist.get(0);
		System.out.println("First element: " + firstvar);
		linkedlist.set(0, "Changed first item");
		Object firstvar2 = linkedlist.get(0);
		System.out.println("First element after update by set method: "
				+ firstvar2);

		/* Remove first and last element */
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out
				.println("LinkedList after deletion of first and last element: "
						+ linkedlist);

		/* Add to a Position and remove from a position */
		linkedlist.add(0, "Newly added item");
		linkedlist.remove(2);
		System.out.println("Final Content: " + linkedlist);

		Object linkedlist1 = linkedlist.clone();
		System.out.println("Cloned object values: " + linkedlist1);

	}

	public static void linkedListExample2() {
		LinkedList<String> linkedlist = new LinkedList<>(Arrays.asList("Arjun",
				"Naresh", "Rajesh", "Saranya"));
		linkedlist.add(3, "Ravi");
		linkedlist.addFirst("Satya");
		linkedlist.addLast("Chad");
		Collections.sort(linkedlist);
		System.out.println(linkedlist);

		for (int i = 0; i < linkedlist.size(); i++) {
			System.out.println(linkedlist.get(i));
		}

		for (String s : linkedlist) {
			System.out.println(s);
		}

		Iterator i = linkedlist.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		int j = 0;
		while (linkedlist.size() > j) {
			System.out.println(linkedlist.get(j));
			j++;
		}

		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6,
				7));
		int b[] = new int[5];
		for (int c : b) {
			b[c] = a.get(c);
		}
		System.out.println(b[0]);

		LinkedList<String> pushExample = new LinkedList<>(Arrays.asList("1",
				"2", "3", "4", "5"));
		pushExample.push("a");
		System.out.println(pushExample);

		pushExample.pop(); // Removes and returns the first element of the list.
		System.out.println(pushExample);

		LinkedList<String> pollExample = new LinkedList<>(Arrays.asList("1",
				"2"));

		pushExample.pollFirst(); //
		System.out.println("pollFirst" + pollExample);

		pushExample.pollLast(); // Retrieves and removes the head (first
								// element)of this list.
		System.out.println("pollLast" + pollExample);

		LinkedList<String> linkedlist1 = new LinkedList<>(Arrays.asList("1",
				"2", "3", "4", "5"));
		ArrayList<String> arraylist = new ArrayList<>();
		Object obje = arraylist.addAll(linkedlist1);
		System.out.println(obje.toString());

		ArrayList<String> a23 = new ArrayList<>(Arrays.asList("1", "3", "2"));
		LinkedList<String> b23 = new LinkedList<>();
		b23.addAll(a23);
		System.out.println(b23);

		ArrayList<String> a24 = new ArrayList<>(a23);
		LinkedList<String> a25 = new LinkedList<>(a23);
		System.out.println(a24);
		System.out.println(a25);
		
		String[] array = a23.toArray(new String[a23.size()]); //Double[] array = linkedlist.toArray(new Double[linkedlist.size()]);


		System.out.println(array[0]);
	}
}
