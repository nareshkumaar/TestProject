package com.test.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.test.dto.EmployeesDTO;
import com.test.dto.StudentDTO;

public class ArrayListExample {

	/* https://beginnersbook.com/2013/12/java-arraylist/ */
	/* https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html*/
	
	public static void main(String[] args) {
		listExample1();
		listExample2();
		listExample3();
		listExample4();
		listExample5();
		listExample6();
		listExample7();
		listExample8();
		listExample9();
	}

	public static void listExample1() {
		List<String> csk = new ArrayList<String>();
		List<String> indiaTeam = new ArrayList<String>();

		csk.add("MS Dhoni");
		csk.add("Suresh Raina");
		csk.add("Ashwin");
		csk.add("Muralidharan");
		csk.add("Morkel");

		indiaTeam.add("MS Dhoni");
		indiaTeam.add("Suresh Raina");
		indiaTeam.add("Ashwin");

		List<String> commonString = new ArrayList<String>();

		for (String s : csk) {
			for (String t : indiaTeam) {
				if (s.equalsIgnoreCase(t)) {
					commonString.add(t);
				}
			}
		}
		System.out.println("Common Players are:" + commonString);
	}

	public static void listExample2() {
		List<String> csk = new ArrayList<String>();
		List<String> indiaTeam = new ArrayList<String>();

		csk.add("MS Dhoni");
		csk.add("Suresh Raina");
		csk.add("Ashwin");
		csk.add("Muralidharan");
		csk.add("Morkel");

		indiaTeam.add("MS Dhoni");
		indiaTeam.add("Suresh Raina");
		indiaTeam.add("Ashwin");

		List<String> allPlayers = new ArrayList<String>();
		allPlayers.addAll(csk);
		allPlayers.addAll(indiaTeam);

		csk.removeAll(indiaTeam);

		System.out.println("foreignPlayers are:" + csk);
	}

	public static void listExample3() {

		EmployeesDTO employeesDTO1 = new EmployeesDTO();
		List<EmployeesDTO> employee = new ArrayList<EmployeesDTO>();
		employeesDTO1.setEmployeeName("Naresh");
		employeesDTO1.setEmployeeAge(28);
		employeesDTO1.setEmployeeSalary(6000);
		employee.add(employeesDTO1);
		employee.add(employeesDTO1);
		employee.set(1, employeesDTO1);

		System.out.println(employee.get(0).getEmployeeName());

		List<String> obj = new ArrayList<String>(Arrays.asList("Pratap",
				"Peter", "Harsh"));
		System.out.println("Elements are:" + obj);

	}

	public static void listExample4() {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for (int counter = 0; counter < arrlist.size(); counter++) {
			System.out.println(arrlist.get(counter));
		}

		/* Advanced For Loop */
		System.out.println("Advanced For Loop");
		for (Integer num : arrlist) {
			System.out.println(num);
		}

		/* While Loop for iterating ArrayList */
		System.out.println("While Loop");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.println(arrlist.get(count));
			count++;
		}

		/* Looping Array List using Iterator */
		System.out.println("Iterator");
		Iterator<Integer> iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

	public static void listExample5() {

		Collection<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> an = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4));
		System.out.println(an);
		System.out.println("Initial size: " + al.size());
		al.add(1);
		al.add(13);
		al.add(45);
		al.add(44);
		al.add(99);
		System.out.println("Size after few additions: " + al.size());
		al.remove(1);
		al.remove(2);
		System.out.println("Size after remove operations: " + al.size());
		System.out.println("Final ArrayList: ");
		for (int num : al) {
			System.out.println(num);
		}
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After Reverse:" + al);
	}

	public static void listExample6() {

		ArrayList<String> listOfCountries = new ArrayList<>(Arrays.asList(
				"India", "Pakistan", "Sri Lanka"));
		Collections.sort(listOfCountries);
		System.out.println(listOfCountries);

		{
			ArrayList<Integer> arraylist = new ArrayList<Integer>();
			arraylist.add(11);
			arraylist.add(2);
			arraylist.add(7);
			arraylist.add(3);
			/* ArrayList before the sorting */
			System.out.println("Before Sorting:");
			for (int counter : arraylist) {
				System.out.println(counter);
			}

			/* Sorting of arraylist using Collections.sort */
			Collections.sort(arraylist);

			/* ArrayList after sorting */
			System.out.println("After Sorting:");
			for (int counter : arraylist) {
				System.out.println(counter);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void listExample7() {
		 ArrayList<StudentDTO> arraylist = new ArrayList<StudentDTO>();
		   arraylist.add(new StudentDTO(223, "Chaitanya", 26));
		   arraylist.add(new StudentDTO(245, "Rahul", 24));
		   arraylist.add(new StudentDTO(209, "Ajeet", 32));

		   Collections.sort(arraylist);

		   for(StudentDTO str: arraylist){
				System.out.println(str);
		   }
	}
	
	public static void listExample8() {
		ArrayList<StudentDTO> arraylist = new ArrayList<StudentDTO>();
		   arraylist.add(new StudentDTO(101, "Zues", 26));
		   arraylist.add(new StudentDTO(505, "Abey", 24));
		   arraylist.add(new StudentDTO(809, "Vignesh", 32));

		   /*Sorting based on Student Name*/
		   System.out.println("Student Name Sorting:");
		   Collections.sort(arraylist, StudentDTO.StuNameComparator);
		   
		   for(StudentDTO str: arraylist){
				System.out.println(str);
		   }
	}
	
	public static void listExample9() {
		 ArrayList<String> al = new ArrayList<String>();

	     //Addition of elements in ArrayList
	     al.add("Steve");
	     al.add("Justin");
	     al.add("Ajeet");
	     al.add("John");
	     al.add("Arnold");
	     al.add("Chaitanya");

	     System.out.println("Original ArrayList Content: "+al);
	     
	     //Sublist to ArrayList
	     ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
	     System.out.println("SubList stored in ArrayList: "+al2);

	     //Sublist to List
	     List<String> list = al.subList(1, 4);
	     System.out.println("SubList stored in List: "+list);
	}
}
