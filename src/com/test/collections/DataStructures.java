package com.test.collections;

public class DataStructures {

	public int roll_no;
	public String name;

	DataStructures(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}

	public DataStructures() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DataStructures ds = new DataStructures();
		ds.array();

	}

	// https://www.geeksforgeeks.org/data-structures/

	void dataStructures() {
		/*
		 * Array LinkedList Stack Queue Binary Tree Binary Search Tree Heap
		 * Hashing Graph Matrix Misc Advanced Data Structure
		 */
	}

	void array() {
		/*
		 * Arrays
		 * 
		 * An array is collection of items stored at continuous memory
		 * locations. The idea is to store multiple items of same type together.
		 * This makes it easier to calculate the position of each element by
		 * simply adding an offset to a base value, i.e., the memory location of
		 * the first element of the array (generally denoted by the name of the
		 * array).
		 * 
		 * Types of indexing in array:
		 * 
		 * 0 (zero-based indexing): The first element of the array is indexed by
		 * subscript of 0 1 (one-based indexing): The first element of the array
		 * is indexed by subscript of 1 n (n-based indexing): The base index of
		 * an array can be freely chosen.
		 * 
		 * Usually programming languages allowing n-based indexing also allow
		 * negative index values and other scalar data types like enumerations,
		 * or characters may be used as an array index. Advantages of using
		 * arrays: * Arrays allow random access of elements. This makes
		 * accessing elements by position faster. Arrays have better cache
		 * locality that can make a pretty big difference in performance.
		 */

		int intArray[]; // declaring array
		intArray = new int[20]; // allocating memory to array

		int[] intArray1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// Declaring array literal

		int[][] intArray2 = new int[10][20]; // a 2D array or matrix
		int[][][] intArray3 = new int[10][20][10]; // a 3D array

		// declaring and initializing 2D array
		int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
		/*
		 * Multidimensional Arrays
		 * 
		 * Multidimensional arrays are arrays of arrays with each element of the
		 * array holding the reference of other array. These are also known as
		 * Jagged Arrays. A multidimensional array is created by appending one
		 * set of square brackets ([]) per dimension. Examples:
		 */
		// printing 2D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}

		{
			/*
			 * Arrays in Java 1.8 An array is a group of like-typed variables
			 * that are referred to by a common name.Arrays in Java work
			 * differently than they do in C/C++. Following are some important
			 * point about Java arrays.
			 * 
			 * In Java all arrays are dynamically allocated.(discussed below)
			 * Since arrays are objects in Java, we can find their length using
			 * member length. This is different from C/C++ where we find length
			 * using sizeof. A Java array variable can also be declared like
			 * other variables with [] after the data type. The variables in the
			 * array are ordered and each have an index beginning from 0. Java
			 * array can be also be used as a static field, a local variable or
			 * a method parameter. The size of an array must be specified by an
			 * int value and not long or short. The direct superclass of an
			 * array type is Object. Every array type implements the interfaces
			 * Cloneable and java.io.Serializable.
			 */
		}
		{
			int[] sample;
			sample = new int[5];
			sample[0] = 1;
			System.out.println(sample[0]);
		}
		{
			DataStructures[] arra;
			arra = new DataStructures[5];
			arra[0] = new DataStructures(1, "Arjun");
			arra[1] = new DataStructures(1, "Rajesh");
			arra[2] = new DataStructures(1, "Naresh");
			System.out.println(arra.length);
			for (int i = 0; i < arra.length; i++) {
				System.out.println(arra[i]);
				System.out.println(arra[i].name + arra[i].roll_no);
			}
		}

	}
	
	void linkedList(){
		//Singly, Circular, doubly, 
	}

}
