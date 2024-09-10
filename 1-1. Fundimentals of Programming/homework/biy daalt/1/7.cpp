#include <iostream>
using namespace std;

int main()
{
    string surname, given_name, lekts;
    int age;

    cout << "Suragchiin ovog: ";
    cin >> surname;
    cout << "Suragchiin ner: ";
    cin >> given_name;
    cout << "Suragchiin nas: ";
    cin >> age;
    cout << "Suragchiin lekts: ";
    cin >> lekts;

    // Print the student's information
    cout << "The student's name is " << given_name << " " << surname << "." << endl;
    cout << "The student is " << age << " years old." << endl;
    cout << "The student is studying " << lekts << "." << endl;

    return 0;
}
