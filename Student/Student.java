package org.Student;

import org.department.*;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student name method is being called from Student class");
	}
	public void studentDept() {
		System.out.println("Student department method is being called from Student class");
	}
	public void studentId() {
		System.out.println("Student ID method is being called from Student class");
	}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.studentId();
		stud.studentName();
		stud.studentDept();
		stud.deptName();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
	}
}
