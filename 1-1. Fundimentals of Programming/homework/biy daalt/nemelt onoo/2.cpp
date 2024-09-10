#include <iostream>
#include <cmath>

using namespace std;

int main()
{
  // Variables to store the numbers
  double num1, num2;

  // Variable to store the operator
  char op;

  // Flag to check if the program should exit
  bool shouldExit = false;

  while (!shouldExit)
  {
    // Prompt the user to enter the numbers and the operator
    cout << "Enter two numbers and an operator (+, -, *, /, or %): ";
    cin >> num1 >> num2 >> op;

    // Perform the appropriate operation based on the operator
    switch (op)
    {
      case '+':
        cout << num1 + num2 << endl;
        break;
      case '-':
        cout << num1 - num2 << endl;
        break;
      case '*':
        cout << num1 * num2 << endl;
        break;
      case '/':
        cout << num1 / num2 << endl;
        break;
      case '%':
        cout << (int)num1 % (int)num2 << endl;
        break;
      case 'q':
        // Set the flag to true to exit the loop
        shouldExit = true;
        break;
      default:
        cout << "Invalid operator" << endl;
        break;
    }
  }

  return 0;
}

