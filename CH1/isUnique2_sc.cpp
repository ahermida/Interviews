/*
Sam Cacela		isUnique2_sc.cpp		1/22/17

Cracking the Code -- Interview Question 1.1

insert characters of word into set
check whether length of set is same
as length of word
*/

#include <iostream>
#include <set>

int main () { 

	std::string word;
	std::set<char> s;
	 
	std::cout << "Enter a word: ";
	std::getline (std::cin,word);

	// place each character into set s
	for (int i=0; i<word.length(); i++)
		s.insert(word[i]);

	// initialize to true
	bool isUnique2 = true;

	// false if different lengths
	if (s.size() != word.length())
	    isUnique2 = false;

	// boolalpha allows bool values to appear as true
  	// and false instead of 1 and 0
	std::cout << std::boolalpha << isUnique2 << '\n';
}