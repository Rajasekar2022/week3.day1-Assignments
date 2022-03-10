package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Name - studentName");
	}
	public void studentDept() {
		System.out.println("Department - studentName");
	}
	public void studentId() {
		System.out.println("ID - studentId");
	}


	public static void main(String[] args) {
	
	Student st = new Student();
	st.collegeCode();
	st.collegeName();
	st.collegeRank();
	st.deptName();
	st.studentId();
	st.studentDept();
	st.studentName();

	}

}
