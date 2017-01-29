/*
Sam Cacela      isUnique_sc.cpp      1/22/17

Cracking the Code -- Interview Question 1.1

sort characters of word, then interate through
characters and check whether character i is same
as next character i+1
*/

#include <iostream>
#include <string>
#include <algorithm> // sorting

int main () {
  std::string word;

  std::cout << "Enter a word: ";
  std::getline (std::cin,word);

  // sort the word
  std::sort(word.begin(), word.end());

  // initialize to true
  bool isUnique = true;

  // compare each character to its neighbor, false if same
  for (int i=0; i<word.length(); i++) {
    if (word[i] == word[i+1])
      isUnique = false;
  }

  // boolalpha allows bool values to appear as true
  // and false instead of 1 and 0
  std::cout << std::boolalpha << isUnique << "\n";
}