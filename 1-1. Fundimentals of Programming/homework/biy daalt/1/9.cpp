#include <iostream>
#include <cmath>
using namespace std;

int main() {
    double a, b, c;

    cout << "a = ";
    cin >> a;
    cout << "b = ";
    cin >> b;
    cout << "c = ";
    cin >> c;

    double D = b * b - 4 * a * c;
    if (D > 0)
    {
        double s1 = (-b + sqrt(D)) / (2 * a);
        double s2 = (-b - sqrt(D)) / (2 * a);
        cout << "s1 = " << s1 << "s2 = " << s2 << "." << endl;
    }
    else if (D == 0)
    {
        double s = -b / (2 * a);
        cout << "s = " << s << "." << endl;
    }
    else
    {
        cout << "Bolomjgui too ogov." << endl;
    }

    return 0;
}
