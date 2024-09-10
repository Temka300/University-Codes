#include <iostream>

int main() {
  	std::cout << "Dugaar oruulna uu: ";
 	int n;
  	std::cin >> n;

  	int too[n];
  	for (int i = 0; i < n; i++) {
    	too[i] = i + 1;
  	}

  	int s = 0;
  	for (int i = 0; i < n; i++) {
    	s += too[i];
  	}

	std::cout << "1 ees " << n << " toonii hariu: " << s << std::endl;
	return 0;
}
