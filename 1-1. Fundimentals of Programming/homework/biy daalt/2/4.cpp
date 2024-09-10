#include<iostream>
#include<cmath>
using namespace std;
int main(){
	char calc;
	float a,b;
	
	cout<<"ymar uildel ve?(+,-,*,/,pow): "; cin>>calc;
	cout<<"2 too oruulna uu: "; cin>>a>>b;
	
	switch(calc) {
		case '+':
      cout << a << " + " << b << " = " << a + b;
      break;

    case '-':
      cout << a << " - " << b << " = " << a - b;
      break;

    case '*':
      cout << a << " * " << b << " = " << a * b;
      break;

    case '/':
      cout << a << " / " << b << " = " << a / b;
      break;
    
    case 's':
    	cout<< a << " ^ " << b << " = " << pow(a,b);
	}
}
