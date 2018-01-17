package com.test.collections;

import java.util.Vector;

public class VectorExamples {
	
	/* https://beginnersbook.com/2013/12/difference-between-arraylist-and-vector-in-java/ */
		
	public static void main(String[] args) {
		vectorExample1();
		
	}
	
	public static void vectorExample1(){
		Vector v1 = new Vector();
		v1.add("Hi");
		v1.add("Jayashree");
		System.out.println(v1);
		
		Vector<String> v2 = new Vector<>(4,6);
		v2.add("Naresh");
		v2.add("NAresh");
		for(int i=0;i<v2.size();i++){
			System.out.println(v2.get(i));
		}
		
		Vector<String> v3 = new Vector<>();
		v3.addElement("Rajesh");
		System.out.println(v3);
		
	}
	
}
