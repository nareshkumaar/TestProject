package com.test.dto;

public class EmployeesDTO {
	private static String employeeName;
	private static int employeeSalary;
	private static int employeeAge;
	
	public static String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeesDTO.employeeName = employeeName;
	}
	public static int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		EmployeesDTO.employeeSalary = employeeSalary;
	}
	public static int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		EmployeesDTO.employeeAge = employeeAge;
	}
	
	
	
	
}
