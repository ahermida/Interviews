/*
isPermutation_sc.cpp      1/25/17

Cracking the Code -- Interview Question 1.2

Given two strings, write a method to decide if one is a permutation of the other
*/

#include <iostream>
#include <string>
#include <algorithm> // sorting

int main () {
  std::string w0, w1;

  std::cout << "Enter a word: ";
  std::getline (std::cin,w0);

  std::cout << "Enter another word: ";
  std::getline (std::cin,w1);

  std::sort(w0.begin(), w0.end());
  std::sort(w1.begin(), w1.end());

  bool isPerm = true;

    for (int i=0; i<w0.length(); i++) {
        if (w0[i] != w1[i])
        isPerm = false;
    }

    std::cout << std::boolalpha << isPerm << "\n";
}