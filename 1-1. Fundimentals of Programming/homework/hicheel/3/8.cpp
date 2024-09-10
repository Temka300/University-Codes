#include <iostream>

using namespace std;

int main()
{
  int ondor, tal, tal2;

  cout << "Trapetsiin ondor: ";
  cin >> ondor;

  cout << "Trapetsiin tal: ";
  cin >> tal;

  cout << "Trapetsiin nogoo tal: ";
  cin >> tal2;

  int talbai = (tal + tal2) / 2 * ondor;

  cout << "Trapetsiin tailbai: " << talbai << endl;

  return 0;
}

