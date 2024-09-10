#include <iostream>

int main() {
	std::cout << "Dugaar oruulna uu: ";
 	int n;
 	std::cin >> n;

  	int sondgoi = 0;
  	for (int i = 1; i <= n; i += 2) {
    	sondgoi += i;
  	}

  	int tegsh = 0;
  	for (int i = 2; i <= n; i += 2) {
    	tegsh += i;
  	}

	std::cout << "Sondgoi toonii 1 ees " << n << " hariu: " << sondgoi << std::endl;
	std::cout << "Tegsh toonii 1 ees " << n << " hariu: " << tegsh << std::endl;
	return 0;
}
