#include <iostream>
using namespace std;

int main()
{
    int numbers[10];
    cout << "10 too oruulna uu: ";
    for (int i = 0; i < 10; i++){
    	cin >> numbers[i];	
	}
	
    int result = 1;
    for (int i = 0; i < 10; i++){
        result *= numbers[i];
	}
	
    cout << "Toonuudiin urjver bol: " << result << endl;
    return 0;
}
