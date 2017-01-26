/*
Sam Cacela		isUnique2_sc.cpp		1/22/17

insert characters of word into set
check whether length of set is same
as length of word
*/

#include <iostream>
#include <set>
using namespace std;

int main ()
{ 
  std::string word;


 std::set<char> s;
 
  std::cout << "Enter a word: ";
  std::getline (std::cin,word);
  

for (int i=0; i<word.length(); i++) {
 s.insert(word[i]);
}

  bool isUnique2 = true;

  if (s.size() != word.length())
    isUnique2 = false;

  std::cout << << std::boolalpha << isUnique2 << "\n";
}