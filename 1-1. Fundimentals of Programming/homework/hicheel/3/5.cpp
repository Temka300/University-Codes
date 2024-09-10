#include <iostream>
#include <cmath>

using namespace std;

int herons(int a, int b, int c)
{
  int s = (a + b + c) / 2;

  return sqrt(s * (s - a) * (s - b) * (s - c));
}

int main()
{
  int a, b, c;

  cout << "Gurvaljnii gurvan taliig oruulna uu: ";
  cin >> a >> b >> c;

  int area = herons(a, b, c);

  cout << "Hariult = " << area << endl;

  return 0;
}
