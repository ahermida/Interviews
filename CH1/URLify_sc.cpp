/*
Sam Cacela      URLify_sc.cpp      1/28/17

Cracking the Code -- Interview Question 1.3

PROMPT:
Write a method to replace all spaces in a string with '%20'.
You may assume that the string has sufficient space at the end
to hold hte additional characters, and that you are given the 'true'
length of the string.

EXAMPLE

Input:  "Mr John Smith     ", 13
OUTPUT: "Mr%20John%20Smith"
*/


#include <iostream>
#include <vector>  // for dynamic array

int main () {
	 std::string word;

   std::cout << "Enter a word: ";
   std::getline (std::cin,word);

   int i = 0; // count backwards through chars in word
   int j = 0; // count forward through dynamic array

   
   bool last_letter;  /* 
                      initialized to false. Used to 
                      prevent trailing spaces from being
                      replaced with '%20'
                      */
   
   // create a dynamic array (unbounded size)
   std::vector<char> array(word.length()); 
   
   
   for (i = word.length()-1; i>=0; i--) {
      if (last_letter == true) {
         if (word.at(i) != ' ')
            array[j] = word.at(i);
         else {
            array[j] = '0';
            j++;
            array[j] = '2';
            j++;
            array[j] = '%';
         }
      }

      if (last_letter == false)
         if (word.at(i) != ' ') {
            last_letter = true;
            array[j] = word.at(i);
         }
      j++;
   }

// j is the length of the URL created
for(int i=j-1; i>=0; i--)
  std::cout << array[i];

std::cout << '\n';  
}