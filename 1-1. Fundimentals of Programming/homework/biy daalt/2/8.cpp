#include <iostream>

using namespace std;

int main() {
  int n,i,s=0;
  cout << "n = "; cin >> n;

  int sum = 0;
  for (i = 1; i < n; i++) {
    if (n % i == 0) {
      s += i;
    }
  }
  if (s == n) {
    cout << n << " togs too" << endl;
  } else {
    cout << n << " togs too bish" << endl;
  }
  return 0;
}
