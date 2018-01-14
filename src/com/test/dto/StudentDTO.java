package com.test.dto;

public class StudentDTO {
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

	public int compareTo(StudentDTO comparestu) {
		int compareAge = ((StudentDTO) comparestu).getStudentage();
		int compareAge1 = comparestu.getStudentage();
		return this.studentage - compareAge;
	}

	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age="
				+ studentage + "]";
	}

}