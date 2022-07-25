package org.student;

public class Students {
	
	public void getStudentInfo(int age) {
		System.out.println("Student age is : "+ age);
		
	}
	public void getStudentInfo(String name) {
		System.out.println("Student name is : " + name);
		
	}
	public void getStudentInfo(String studentID, String name) {
		System.out.println("Student ID & Name: " +studentID   +name);
	}
	public void getStudentInfo(String email, long phoneNumber ) {
		System.out.println("Student E-mail & Phone Number: " +email +phoneNumber);
	}
	
	public static void main(String[] args) {
		Students infoAbtStudent = new Students();
		infoAbtStudent.getStudentInfo(22);
		infoAbtStudent.getStudentInfo("Jaison.B");
		infoAbtStudent.getStudentInfo("K7EC08 &", " Jaison");
		infoAbtStudent.getStudentInfo("Jaison@abc.com ", 123321123);
	}
	

}
