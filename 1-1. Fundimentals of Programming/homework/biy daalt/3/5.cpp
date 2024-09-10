#include <iostream>

bool is_perfect(int n) {
  	if (n < 6) {
    	return false;
  	}

  	int sum = 1;
  	for (int i = 2; i <= n / 2; i++) {
    	if (n % i == 0) {
      		sum += i;
    	}
  	}

  	return sum == n;
}

int main() {
  	std::cout << "Dugaar oruulna uu: ";
  	int n;
  	std::cin >> n;

  	int numbers[n];
  	for (int i = 0; i < n; i++) {
    	numbers[i] = i + 1;
  	}

  	std::cout << "1 ees " << n << " toonii togs too: " << std::endl;
  	for (int i = 0; i < n; i++) {
    	if (is_perfect(numbers[i])) {
      		std::cout << numbers[i] << std::endl;
    	}
  	}

  	return 0;
}

