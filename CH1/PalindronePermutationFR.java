import java.util.*;

// Francisco Rogel January 25, 2017
// Chapter 1 # 4 Question: Write a function to see if
// its is a permutation of a palindrome
// ahnanh will return true (hannah)

public class PalindronePermutationFR 
{

	public static void main(String[] args) 
	{
		String palindromeCanidate = "QWERTYTREWQF"; 
		
		System.out.println("Test to see if strings are permutations of a Palindrone: ");
		System.out.println();
		System.out.println(palindromeCanidate+ ": " + PalindronePermutation(palindromeCanidate));
		System.out.println("QWERTYTREWQ: " + PalindronePermutation("QWERTYTREWQ"));
		System.out.println("Hannah: " + PalindronePermutation("Hannah"));
		System.out.println("Tact Coa: " + PalindronePermutation("Tact Coa"));
		System.out.println("Villanova: " + PalindronePermutation("Villanova"));
		System.out.println("Villanovavonalliv: " + PalindronePermutation("Villanovavonalliv"));
		System.out.println("MacBook Pro: " + PalindronePermutation("MacBook Pro"));
		System.out.println("MacBookooBcam: " + PalindronePermutation("MacBookooBcam"));
		System.out.println("a: " + PalindronePermutation("a"));
		System.out.println("aa: " + PalindronePermutation("aa"));
		System.out.println("aba: " + PalindronePermutation("aba"));
		System.out.println("abba: " + PalindronePermutation("abba"));
		System.out.println("abcdba: " + PalindronePermutation("abcdba"));
	}

	private static boolean PalindronePermutation (String String)
	{		
		String newString = String.replaceAll("\\s+","").toLowerCase();// removing spaces and lowercasing

		int[] LettersSeen = new int[newString.length()]; // Keeping a count of letters we have seen

		char[] stringToCharArray = newString.toCharArray(); // changing the input string to an array or characters

		String newSortedString = new String(stringToCharArray); // char array to string

		for (int i = 0; i < stringToCharArray.length; i++)
		{
			char charAt = newSortedString.charAt(i);

			int count = 0;

			for(int j = 0; j < stringToCharArray.length; j++)
			{
				if (charAt == newSortedString.charAt(j))
				{
					count++;
				}
			}
			LettersSeen[i] = count;

		} 
		int counter = 0;
		for (int i = 0; i < LettersSeen.length; i++)
		{
			if(LettersSeen[i] == 1)
				counter++;
		}

		if ((counter == 1) || counter == 0)
			return true;
		if ( ((counter%2) != 0) || (counter > 1))
			return false;
		else
			return false;
	}
}
