package week3.day1;

public class Palindrome {

	public void name(String Name) {

		String name= Name;
		String rev="";
		for (int i = name.length()-1; i >= 0; i--) {
			name.charAt(i);
			char a = name.charAt(i);
			rev=rev+a;
		}
		if (name.equalsIgnoreCase(rev)) {
			System.out.println("Given String " +name+" is Palindrome");
		}else {
			System.out.println("Given String " +name+" is not a Palindrome");
		}
	}
	public static void main(String[] args) {

		Palindrome p = new Palindrome();
		p.name("madam");
		p.name("Brother");

	}

}
