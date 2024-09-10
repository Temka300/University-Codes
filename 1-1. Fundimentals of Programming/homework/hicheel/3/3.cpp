#include<iostream>
using namespace std;
int main() {
	int a, b, c, d, e, sum, neg, div, mul, per;
	cout<<"% too oruulna uu!: ";
	cin>>a>>b>>c>>d>>e;
	
	sum = a + b + c + d + e;
	neg = a - b - c - d - e;
	mul = a * b * c * d * e;
	div = a / b / c / d / e;
	per = a % b % c % d % e;
	
	cout<<"Nemeh = "<<sum<<endl;
	cout<<"Hasah = "<<neg<<endl;
	cout<<"Urjver = "<<mul<<endl;
	cout<<"Huvaah = "<<div<<endl;
	cout<<"Huvi = "<<div<<endl;
	
	return 0;
}
