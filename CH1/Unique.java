import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Unique 
{
	public static void main(String[] args) throws IOException 
	{
		isUnique("demisemiseptcentennial"); // returns false
		isUnique("Paco");	   				// returns true
		isUnique("Sam");	   				// returns true
		isUnique("Rogel");	   				// returns true
		isUnique("Villanova"); 				// returns false
		isUnique("National");  				// returns false
		isUnique("Champions"); 				// returns true
	}

	//-----------------------------------------------------------------------
	// Method to test if a string and a set are the same in length 
	//-----------------------------------------------------------------------
	public static void isUnique(String String)
	{
		HashSet<Character> charSet = new HashSet<Character>(); // Creating a hashset chars

		char[] stringToCharArray = String.toCharArray(); // from string to chars 

		for (char c : stringToCharArray) 
		{
			charSet.add(c); // adding to set if not already present 
		}

		int randomStringLength = String.length(); // length of String
		int setLength = charSet.size(); // size of set with duplicates removed

		if (randomStringLength == setLength)
			System.out.println("True, no duplicates");		
		else 
			System.out.println("False, duplicates exist");		
	}
	//-----------------------------------------------------------------------
}
