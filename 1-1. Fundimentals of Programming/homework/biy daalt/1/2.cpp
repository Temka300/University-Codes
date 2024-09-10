#include<iostream>
#include<cmath>
using namespace std;
int main() {
	float a,b,c,d,e,arithmatic,geometric,s;
	cout<<"5 too oruulna uu: "; cin>>a>>b>>c>>d>>e;
	arithmatic = (a+b+c+d+e) /5;
	s = a * b * c * d * e;
	geometric = pow(s, (1/5));
	cout<<"Arithmatic mean = "<<arithmatic<<endl;
	cout<<"Geometric mean = "<<geometric<<endl;
	return 0;
}
