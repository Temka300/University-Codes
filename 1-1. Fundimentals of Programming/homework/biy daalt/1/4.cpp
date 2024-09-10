#include <iostream>
#include <string>

using namespace std;

int main()
{
  string ner[5];
  double ondor[5];

  cout << "5 suragchnii nas ba ondriig ogno uu: " << endl;

  for (int i = 0; i < 5; i++)
  {
    cout << "Student " << i + 1 << ": ";
    cin >> ner[i] >> ondor[i];
  }

  int hamgiinOndor = 0;
  for (int i = 1; i < 5; i++)
  {
    if (ondor[i] > ondor[hamgiinOndor])
    {
      hamgiinOndor = i;
    }
  }

  cout << "Hamgiin ondor suragchiin ner " << ner[hamgiinOndor] << " ondor " << ondor[hamgiinOndor] << "." << endl;

  return 0;
}
