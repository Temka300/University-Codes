#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a, b, c;
    cout << "Gurvaljnii neg tal: ";
    cin >> a;
    cout << "Gurvaljnii hoyrdoh tal: ";
    cin >> b;
    cout << "Gurvaljnii guravdah tal: ";
    cin >> c;

    if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c)
            cout << "Gurvaljin adil talt." << endl;
        else if (a == b || b == c || a == c)
            cout << "Gurvaljin tegsh talt." << endl;
        else
            cout << "Gurvaljin tegsh bus talt." << endl;
    }
    
    else {
        cout << "Gurvaljin durs uusehgui." << endl;
    }
    
    return 0;
}
