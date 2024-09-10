#include <iostream>
#include <string>

using namespace std;

int main()
{
  // Declare variables for the student's name, class, and code
  string name;
  char classLetter;
  int code;

  // Read the student's name, class, and code from the user
  cout << "Enter the student's name: ";
  getline(cin, name);

  cout << "Enter the student's class (e.g. A, B, C, etc.): ";
  cin >> classLetter;

  cout << "Enter the student's code: ";
  cin >> code;

  // Print the student's name, class, and code
  cout << endl << "Student name: " << name << endl;
  cout << "Class: " << classLetter << endl;
  cout << "Code: " << code << endl;

  return 0;
}
