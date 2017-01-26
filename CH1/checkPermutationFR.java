import java.io.IOException;
import java.util.*;
// Francisco Rogel January 25, 2017
// Chapter 1 # 2 Question: Given two strings, 
// write a method to decide if one is a permutation 
// of the other  

public class checkPermutationFR 
{

	public static  void main(String[] args) 
	{
		String String1 = "listen";
		String String2 = "silent";

		System.out.println("Testing if " + String1 + " and " + String2 + " contain the same characters");
		
		System.out.println(PermutationChecker(String1, String2));
		
	}

	public static boolean PermutationChecker (String String1, String String2)
	{
		HashSet<Character> charSet1 = new HashSet<Character>(); // Creating a hashset chars
		HashSet<Character> charSet2 = new HashSet<Character>(); // Creating a hashset chars


		char[] stringToChar1 = String1.toCharArray();
		char[] stringToChar2 = String2.toCharArray();


		for (char c : stringToChar1) 
		{
			charSet1.add(c); // adding to set if not already present 
		}

		for (char c : stringToChar2) 
		{
			charSet2.add(c); // adding to set if not already present 
		}

		Arrays.sort(stringToChar1);
		Arrays.sort(stringToChar2);		

		return (stringToChar1.length == stringToChar2.length);
		
	}
}













