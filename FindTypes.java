package week3.day1;

public class FindTypes {

	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			
			if (Character.isAlphabetic(c)) 
			{
				letter++;
			}
			else if(Character.isDigit(c))
			{
				num++;
			}
			else if(Character.isSpaceChar(c)) 
			{
				space++;
			}
			else 
			{
				specialChar++;
			}

		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}

