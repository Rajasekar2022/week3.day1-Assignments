package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student id: "+id);

	}
	public void getStudentInfo(int id, String Name) {
		System.out.println("Student id: "+id+" and Name is "+Name );

	}
	
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("Student email: "+email+" and phone number is "+phoneNumber );

	}
	
	public static void main(String[] args) {
		Students st = new Students();
		st.getStudentInfo(123);
		st.getStudentInfo(123, "Raja");
		st.getStudentInfo("raja@gmail.com", 1234567890);
	}
	
}
