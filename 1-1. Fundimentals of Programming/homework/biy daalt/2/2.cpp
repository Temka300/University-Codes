#include<iostream>
using namespace std;
int max(int a, int b, int c){
	if (a>b && a>c)
		return a;
	else if (b>a && b>c)
		return b;
	else
		return c;
}

int min(int a, int b, int c){
	if (a<b && a<c)
		return a;
	else if (b<a && b<c)
		return b;
	else
		return c;
}

int main(){
	int a,b,c,s,s1;
	cout<<"a="; cin>>a;
	cout<<"b="; cin>>b;
	cout<<"c="; cin>>c;
	s = max(a,b,c);
	s1 = min(a,b,c);
	cout<<"ih = "<<s;
	cout<<"\n";
	cout<<"baga = "<<s1;
}
