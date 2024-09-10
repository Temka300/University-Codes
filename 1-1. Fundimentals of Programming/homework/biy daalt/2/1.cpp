#include<iostream>
using namespace std;
main(){
	int a,b,s,s1;
	cout<<"a="; cin>>a;
	cout<<"b="; cin>>b;
	s = max(a,b);
	s1 = min(a,b);
	cout<<"max = "<<s;
	cout<<"\n";
	cout<<"min = "<<s1;
}
