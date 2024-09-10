#include<iostream>
using namespace std;
int main() {
	int s=0,n,i,flag=0;
	cout<<"n="; cin>>n;
	s=n/2;
	for(i=2;i<=s;i++){
		if(n%i==0){
			cout<<"Prime too bish";
			flag=1;
			break;
		}
	}
	if(flag==0){
		cout<<"prime too mon";
	}
	return 0;
}
