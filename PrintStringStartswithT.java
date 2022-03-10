package week3.day1;

import java.util.Iterator;

public class PrintStringStartswithT {

	public static void main(String[] args) {

		String text = "TestLeaf is located in Teynampet and above a taccobell";		
		boolean starts= text.startsWith("t");
		//Split the giver sentance to words which is seperated by space
		String[] split = text.split(" ");
		//To get the word starts with T or t
		for (int i = 0; i < split.length; i++) {

			if (split[i].startsWith("t")||split[i].startsWith("T")) {
				System.out.println(split[i]);
			}
		}

		//Find the number of Vowels in the given string
		String edu = "Education";
		String EdulowerCase = edu.toLowerCase();
		int count =0;
		//Iterate the string to get the count of Vowels
		for (int j = 0; j < EdulowerCase.length(); j++) {
			edu.charAt(j);
			if (EdulowerCase.charAt(j)=='a'||EdulowerCase.charAt(j)=='e'
				||EdulowerCase.charAt(j)=='i'||EdulowerCase.charAt(j)=='o'
				||EdulowerCase.charAt(j)=='u') 
			{
				count++;
			}
		}
		System.out.println("Number of Vowels in the given string "+edu+" is "+count);
	}

}
