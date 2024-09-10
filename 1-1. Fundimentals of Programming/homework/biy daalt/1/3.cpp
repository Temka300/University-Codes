#include <iostream>

using namespace std;

int main()
{
  int n1, n2, n3, n4, n5, n6, n7;

  cout << "Enter seven numbers: ";
  cin >> n1 >> n2 >> n3 >> n4 >> n5 >> n6 >> n7;

  int high = max(max(max(max(max(max(n1, n2), n3), n4), n5), n6), n7);
  int low = min(min(min(min(min(min(n1, n2), n3), n4), n5), n6), n7);

  cout << "The highest number is " << high << endl;
  cout << "The lowest number is " << low << endl;

  return 0;
}

