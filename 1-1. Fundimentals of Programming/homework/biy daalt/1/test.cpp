#include <iostream>
#include <string>
using namespace std;

int main()
{
    // Declare variables to store the animals' information
    string name, type;
    int age;
    
    cout << "Enter the animal's name: ";
    cin >> name;
    cout << "Enter the animal's type (horse, goat, camel, cow, or sheep): ";
    cin >> type;
    cout << "Enter the animal's age: ";
    cin >> age;

    if (type == "horse") {
    	// Print the specific names for each animal
    	if (age == 1)
        	cout << name << " nasnii ner Unaga." << endl;
    	else if (age == 2)
        	cout << name << " nasnii ner Daaga." << endl;
    	else if (age == 3)
        	cout << name << " nasnii ner Shudlen." << endl;
    	else if (age == 4)
        	cout << name << " nasnii ner Hyazaalan." << endl;
    	else if (age == 5)
        	cout << name << " nasnii ner Soyolon." << endl;
    	else if (age == 6)
        	cout << name << " nasnii ner Buduun." << endl;
    	else if (age >= 7)
        	cout << name << " nasnii ner Azarga." << endl;
    }
    
    else if (type == "camel") {
    		// Print the specific names for each animal
    	if (age == 1)
        	cout << name << " nasnii ner Botgo." << endl;
    	else if (age == 2)
        	cout << name << " nasnii ner Torom." << endl;
    	else if (age == 3)
        	cout << name << " nasnii ner Toilog." << endl;
    	else if (age == 4)
        	cout << name << " nasnii ner Guna." << endl;
    	else if (age == 5)
        	cout << name << " nasnii ner Donj." << endl;
    	else if (age == 6)
        	cout << name << " nasnii ner Buduun." << endl;
    	else if (age >= 7)
        	cout << name << " nasnii ner Buur." << endl;
	}
	
	if (type == "goat") {
    	// Print the specific names for each animal
    	if (age == 1)
        	cout << name << " nasnii ner Ishig." << endl;
    	else if (age == 2)
        	cout << name << " nasnii ner Borlon." << endl;
    	else if (age == 3)
        	cout << name << " nasnii ner Shudlen." << endl;
    	else if (age == 4)
        	cout << name << " nasnii ner Hyazaalan" << endl;
    	else if (age == 5)
        	cout << name << " nasnii ner Soyolon." << endl;
    	else if (age == 6)
        	cout << name << " nasnii ner Buduun." << endl;
    	else if (age >= 7)
        	cout << name << " nasnii ner Uhna." << endl;
    }
    
    if (type == "sheep") {
    	// Print the specific names for each animal
    	if (age == 1)
        	cout << name << " nasnii ner Hurga." << endl;
    	else if (age == 2)
        	cout << name << " nasnii ner Tolog." << endl;
    	else if (age == 3)
        	cout << name << " nasnii ner Zusag." << endl;
    	else if (age == 4)
        	cout << name << " nasnii ner Hyazaalan." << endl;
    	else if (age == 5)
        	cout << name << " nasnii ner Soyolon." << endl;
    	else if (age == 6)
        	cout << name << " nasnii ner Buduun." << endl;
    	else if (age >= 7)
        	cout << name << " nasnii ner Huts." << endl;
    }
    
    if (type == "cow") {
    	// Print the specific names for each animal
    	if (age == 1)
        	cout << name << " nasnii ner Tugal." << endl;
    	else if (age == 2)
        	cout << name << " nasnii ner Byaruu." << endl;
    	else if (age == 3)
        	cout << name << " nasnii ner Shudlen." << endl;
    	else if (age == 4)
        	cout << name << " nasnii ner Guna." << endl;
    	else if (age == 5)
        	cout << name << " nasnii ner Dono." << endl;
    	else if (age == 6)
        	cout << name << " nasnii ner Buduun." << endl;
    	else if (age >= 7)
        	cout << name << " nasnii ner Buh." << endl;
    }
    return 0;
}

