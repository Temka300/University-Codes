#include <iostream>

using namespace std;

int findFourthCoordinate(int x1, int y1, int x2, int y2, int x3, int y3, int &x4, int &y4)
{
  int dx1 = x2 - x1;
  int dy1 = y2 - y1;
  int dx2 = x3 - x1;
  int dy2 = y3 - y1;

  x4 = x1 + dx1 + dx2;
  y4 = y1 + dy1 + dy2;
}

int main()
{
  int x1, y1, x2, y2, x3, y3;

  cout << "1 dah coordinat: ";
  cin >> x1 >> y1;

  cout << "2 dah coordinat: ";
  cin >> x2 >> y2;

  cout << "3 dah coordinat: ";
  cin >> x3 >> y3;

  int x4, y4;
  findFourthCoordinate(x1, y1, x2, y2, x3, y3, x4, y4);
  cout << "4 deh coordinat: " << x4 << " " << y4 << "" << endl;

  return 0;
}
