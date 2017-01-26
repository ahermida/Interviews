/*
isUnique.cpp

1/22/17

sort characters of word, then interate through
characters and check whether character i is same
as next character i+1
*/


#include <iostream>
#include <string>
#include <algorithm> // sorting

int main () {
  std::string word;

  std::cout << "Please, enter a word: ";
  std::getline (std::cin,word);

  std::sort(word.begin(), word.end());

  bool isUnique = true;

    for (int i=0; i<word.length(); i++) {
        if (word[i] == word[i+1])
        isUnique = false;
    }

    std::cout << isUnique << "\n";
}