#include<iostream>
using namespace std;
int main()
{
  int n,i,s=1;
 
  cout<<"too = "; cin >> n;
  for(i = 1; i <= n; i++) {
		s *= i;
  }
  cout << s;
  return 0;
}
