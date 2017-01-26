// Francisco Rogel January 25, 2017
// Chapter 1 # 3 Question: Given a String place %20
// between every space
// e.g. Mr F Rogel --> Mr%20F%20Rogel
public class URLifyFR 
{

	public static void main(String[] args) 
	{

		char[] URL = { 'M', 'r', ' ', 'J', 'o', 'h', 'n',' ','S', 'm', 'i', 't', 'h', 'x', 'x', 'x', 'x', 'x', 'x'};							

		int lengthOfString = 12;

		System.out.println(lengthOfString);

		int count = 0;

		for (int i = 0; i < lengthOfString; i++)
		{	
			if (URL[i] == ' ')
				count++;
		}

		int numbersToAdd = count * 2;

		System.out.println(count );

		int newArrayLength = (lengthOfString + numbersToAdd);

		System.out.println(newArrayLength );

		char[] newURL = new char[newArrayLength];


		//System.out.println(newURL[10]);
		//System.out.println(newURL[2]);
		//System.out.println(newURL[11]);

		int newURLCount = newArrayLength-1;

		for (int j = lengthOfString-1; j > 0; j--)
		{
			if (URL[j] == ' ')
			{
				URL[newURLCount--] = '0'; // same as j-- after this line
				URL[newURLCount--] = '2';
				URL[newURLCount--] = '%';
			}
			else
				URL[newURLCount--] = URL[j] ;
		}
		//for (int k = 0; k < newURL.length; k++)
		//{
			//System.out.println(newURL[k]);
		System.out.println(String.valueOf(URL));
	}
}
