#include <iostream>
#include <string>

using namespace std;

int main()
{
  string st, name, classs;

  cout << "Suragchiin kod: ";
  cin>>st;

  cout << "Ner: ";
  cin>>name;;

  cout << "Angi: ";
  getline(cin, classs);

  cout << endl << "Student name: " << st << endl;
  cout << "Class: " << name << endl;
  cout << "Code: " << classs << endl;

  return 0;
}

