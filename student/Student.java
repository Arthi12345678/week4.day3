package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Arthi");
	}
	public void studentDept() {
		System.out.println("Computer Science");
	}
public void studentId() {
	System.out.println(3);
}
public static void main(String[] args) {
	Student studDetails=new Student();
	studDetails.studentDept();
	studDetails.studentId();
	studDetails.studentName();
	studDetails.collegeCode();
	studDetails.collegeName();
	studDetails.collegeRank();
	studDetails.depName();
	
}
}
