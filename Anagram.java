package week3.day1;

import java.util.Arrays;

import org.apache.poi.hpsf.Array;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Anonymous;

public class Anagram {

	public void anog() {
		//Declare 2 string	
		String text1 = "stops";
		String text2 = "potss";
		//get the length of the string
		int length1 = text1.length();
		int length2 = text2.length();
		//compare the length both of the string
		if (length1==length2) {
			//convert to char array
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			//sorting the array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			//comparing the char array vale are equal
			if (Arrays.equals(charArray1, charArray2)) {

				System.out.println("Both the string are Anagram");
			}else {
				System.out.println("Both the string are not Anagram");
			}
			
		}
	}
	
	
	public static void main(String[] args) {

		Anagram ag = new Anagram();
		ag.anog();
	}

}
