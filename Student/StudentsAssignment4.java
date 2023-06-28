package org.Student;

public class StudentsAssignment4 {
	
	public void getStudentInfo(int id) {
		System.out.println("The student id is "+id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("The student id "+id+" belongs to "+name);
	}
	
	public void getStudentInfo(String email, long number) {
		System.out.println("The contact details of the students are given below");
		System.out.println("Email address : "+email);
		System.out.println("Contact number : "+number);
	}
	public static void main(String[] args) {
		int idnum = 2345;
		String nm = "Raelyn";
		String email = "emailaddress@gmail.com";
		long phone = 6876543233L;
		StudentsAssignment4 stu = new StudentsAssignment4();
		stu.getStudentInfo(idnum);
		stu.getStudentInfo(idnum, nm);
		stu.getStudentInfo(email, phone);
		
	}

}
