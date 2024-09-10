#include <iostream>
using namespace std;

int main() {
	int a, b, c, d, e, i;
	cin>>a>>b;
	c=0;
	for (i=1; i<=100; i++) {
		d=a%i;
		e=b%i;
		if(d==0 && e==0) {
		c=i;
		}
	}
	
	cout<<c;
	return 0;
}
