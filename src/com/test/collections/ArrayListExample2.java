package com.test.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listExample1();
		listExample2();
		listExample3();
		listExample4();
		listExample5();
		listExample6();
		listExample7();
		listExample8();
	}

	private static void listExample1() {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("hi");
		al1.add("How are you");
		al1.add("Good Morning");
		al1.add("bye");
		al1.add("Good night");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Howdy");
		al2.add("Good Evening");
		al2.add("bye");
		al2.add("Good night");

		// Storing the comparison output in ArrayList<String>
		ArrayList<String> al3 = new ArrayList<String>();
		for (String temp : al1)
			al3.add(al2.contains(temp) ? "Yes" : "No");
		System.out.println(al3);

		// Storing the comparison output in ArrayList<Integer>
		ArrayList<Integer> al4 = new ArrayList<Integer>();
		for (String temp2 : al1)
			al4.add(al2.contains(temp2) ? 1 : 0);
		System.out.println(al4);
	}

	private static void listExample2() {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("hi");
		al1.add("How are you");
		al1.add("Good Morning");
		al1.add("bye");
		al1.add("Good night");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Howdy");
		al2.add("Good Evening");
		al2.add("Bye");
		al2.add("Good night");

		al1.addAll(al2);

		Collections.sort(al1);
		System.out.println(al1);

	}

	private static void listExample3() {

		List<String> syncal = Collections
				.synchronizedList(new ArrayList<String>());

		// Adding elements to synchronized ArrayList
		syncal.add("Pen");
		syncal.add("NoteBook");
		syncal.add("Ink");

		System.out.println("Iterating synchronized ArrayList:");
		synchronized (syncal) {
			Iterator<String> iterator = syncal.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}

		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();

		// Adding elements to synchronized ArrayList
		al.add("Pen");
		al.add("NoteBook");
		al.add("Ink");

		System.out.println("Displaying synchronized ArrayList Elements:");
		// Synchronized block is not required in this method
		Iterator<String> iterator = al.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

	private static void listExample4() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin");
		al.add("Rahul");
		al.add("Saurav");
		al.add("Sunil");
		al.add("Kapil");
		al.add("Vinod");

		System.out.println("ArrayList before Swap:");
		for (String temp : al) {
			System.out.println(temp);
		}

		// Swapping 2nd(index 1) element with the 5th(index 4) element
		Collections.swap(al, 1, 4);

		System.out.println("ArrayList after swap:");
		for (String temp : al) {
			System.out.println(temp);
		}
	}

	private static void listExample5() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add("Hi");
		al.add("Howdy");

		try {
			FileOutputStream fos = new FileOutputStream("myfile");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		ArrayList<String> arraylist = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream("myfile");
			ObjectInputStream ois = new ObjectInputStream(fis);
			arraylist = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return;
		}
		for (String tmp : arraylist) {
			System.out.println(tmp);
		}
	}

	public static void listExample6() {
		ArrayList<String> al = new ArrayList<String>();

		// Adding elements to the ArrayList
		al.add("Apple");
		al.add("Orange");
		al.add("Mango");
		al.add("Grapes");
		System.out.println("ArrayList: " + al);

		@SuppressWarnings("unchecked")
		ArrayList<String> al2 = (ArrayList<String>) al.clone();
		System.out.println("Cloned Array List:" + al2);
	}

	public static void listExample7() {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("abc");
		al1.add("xyz");

		System.out.println("ArrayList before clear: " + al1);
		al1.clear();
		System.out.println("ArrayList after clear: " + al1);

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("text 1");
		al2.add("text 2");

		System.out.println("ArrayList before removeAll: " + al2);
		al2.removeAll(al2);
		System.out.println("ArrayList before removeAll: " + al2);

	}

	public static void listExample8() {
		/* Array Declaration and initialization */
		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };

		/* Array to ArrayList conversion */
		ArrayList<String> citylist = new ArrayList<String>(
				Arrays.asList(citynames));

		/* Adding new elements to the converted List */
		citylist.add("New City2");
		citylist.add("New City3");

		/* Final ArrayList content display using for */
		for (String str : citylist) {
			System.out.println(str);
		}
		
		  /* Array Declaration and initialization*/
	    String array[]={"Hi", "Hello", "Howdy", "Bye"};

	    /*ArrayList declaration*/
	    ArrayList<String> arraylist= new ArrayList<String>();

	    /*Conversion*/
	    Collections.addAll(arraylist, array);

	    /*Adding new elements to the converted List*/
	    arraylist.add("String1");
	    arraylist.add("String2");

	    /*Display array list*/
	    for (String str: arraylist)
	    {
	 	System.out.println(str);
	    }
	    
	    
	}
}
