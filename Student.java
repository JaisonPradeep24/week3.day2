package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Jaison");

	}

	public void studentDept() {

		System.out.println("ECE- A");
	}

	public void studentId() {
		System.out.println("K02EC08");

	}

	public static void main(String[] args) {

		Student std = new Student();
		System.out.println("Calling College Class using Multilevel inheritance");
		System.out.println("************************");
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		System.out.println("************************");
		System.out.println("Calling Department Class using Multilevel inheritance");
		System.out.println("************************");
		std.deptName();
		System.out.println("Student Class is called using Multilevel inheritance");
		System.out.println("************************");
		std.studentDept();
		std.studentId();
		std.studentName();
	}
}
