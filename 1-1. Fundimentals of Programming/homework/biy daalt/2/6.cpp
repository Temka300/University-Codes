#include<iostream>
using namespace std;
int main() {
	int n,i,s,teg=0,teg1=1,son=0,son1=1;
	cout<<"n="; cin>>n;
	for(i=1; i<=n;i++){
		if(i%2==0){
			teg += i;
			teg1 *= i;
		}
		else if(i%2!=0){
			son += i;
			son1 *= i;
		}
	}
	cout<<"tegsh niilber = "<<teg<<endl<<"tegsh urjver = "<<teg1<<endl;
	cout<<"sondgoi niilber = "<<son<<endl<<"tegsh urjver = "<<son1<<endl;
}
