package org.department;

import org.college.College;

public class Department extends College {
	public void depName() {
		System.out.println("Computer Science");
	}
	public static void main(String[] args) {
		Department dep=new Department();
		dep.collegeCode();
		dep.collegeName();
		dep.collegeRank();
		dep.depName();
	}

}
