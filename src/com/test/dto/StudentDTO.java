package com.test.dto;

import java.util.Comparator;


public class StudentDTO implements Comparable{
	private String studentname;
	private int rollno;
	private int studentage;

	public StudentDTO(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	public int compareTo(Object comparestu) {
		int compareage = ((StudentDTO) comparestu).getStudentage();
		/* For Ascending order */
		return this.studentage - compareage;

		/* For Descending order do like this */
		// return compareage-this.studentage;
	}

	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age="
				+ studentage + "]";
	}

	 //Comparator for sorting the list by Student Name 
	public static Comparator<StudentDTO> StuNameComparator = new Comparator<StudentDTO>() {

		public int compare(StudentDTO s1, StudentDTO s2) {
			String StudentName1 = s1.getStudentname().toUpperCase();
			String StudentName2 = s2.getStudentname().toUpperCase();

			// ascending order
			return StudentName1.compareTo(StudentName2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

	

}