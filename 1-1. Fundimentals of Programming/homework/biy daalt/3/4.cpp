#include <iostream>
#include <cmath>

bool is_prime(int n) {
  	if (n < 2) {
    	return false;
  	}

  	for (int i = 2; i <= std::sqrt(n); i++) {
    	if (n % i == 0) {
      		return false;
    	}
  	}

  	return true;
}

	int main() {
  	std::cout << "Dugaar oruulna uu: ";
  	int n;
  	std::cin >> n;

  	int numbers[n];
  	for (int i = 0; i < n; i++) {
   		numbers[i] = i + 1;
  	}

  	std::cout << "1 ees " << n << " toonii anhni too: " << std::endl;
  	for (int i = 0; i < n; i++) {
    	if (is_prime(numbers[i])) {
      		std::cout << numbers[i] << std::endl;
    	}
  	}

  	return 0;
}

