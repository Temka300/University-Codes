#include<iostream>
using namespace std;
int main()
{
	int s,a,r,k;
	cout<<"a = "; cin>>a;
	k=a;
	s=0;
	while (k>0) {
		r=k%10;
		s=s*10+r;
		k=k/10;
	}
	if (s==a) 
		printf ("YES");
	else 
		printf("NO");
}
