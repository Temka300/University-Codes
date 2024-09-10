#include <iostream>
#include <string>

using namespace std;

int main()
{
    // initialize variables
    int balance = 1000;
    int option;
    int amount;

    while (true)
    {
        // display menu options
        cout << "ATM Machine" << endl;
        cout << "1. Check balance" << endl;
        cout << "2. Withdraw money" << endl;
        cout << "3. Deposit money" << endl;
        cout << "4. Exit" << endl;

        // get user option
        cout << "Enter option: ";
        cin >> option;

        // handle selected option
        if (option == 1)
        {
            // display balance
            cout << "Your balance is $" << balance << endl;
        }
        else if (option == 2)
        {
            // get amount to withdraw
            cout << "Enter amount to withdraw: ";
            cin >> amount;

            // check if sufficient funds
            if (amount > balance)
            {
                cout << "Insufficient funds" << endl;
            }
            else
            {
                // update balance
                balance -= amount;

                cout << "Please take your cash" << endl;
                cout << "Your new balance is $" << balance << endl;
            }
        }
        else if (option == 3)
        {
            // get amount to deposit
            cout << "Enter amount to deposit: ";
            cin >> amount;

            // update balance
            balance += amount;

            cout << "Your new balance is $" << balance << endl;
        }
        else if (option == 4)
        {
            // exit program
            break;
        }
        else
        {
            // invalid option
            cout << "Invalid option" << endl;
        }
    }

    return 0;
}
