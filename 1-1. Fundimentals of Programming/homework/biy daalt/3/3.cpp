#include <iostream>

int main() {
	std::cout << "Dugaar oruulna uu: ";
  	int n;
  	std::cin >> n;

  	int too[n];
  	for (int i = 0; i < n; i++) {
    	too[i] = i + 1;
  	}

  	int urjver = 1;
  	for (int i = 0; i < n; i++) {
    	urjver *= too[i];
  	}

	std::cout << "1 ees " << n << " toonii urjver: " << urjver << std::endl;
	return 0;
}
