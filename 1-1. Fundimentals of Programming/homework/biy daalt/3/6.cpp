#include<iostream>

bool is_palindrome(int n) {
	int k, r;
	k = n;
	int s = 0;
	while (k > 0) {
		r = k % 10;
		s = s * 10 + r;
		k = k / 10;
	}
	
	if (s == n)	
		return true;
	else
		return false;
}

main() {
	int s,r,k;
	std::cout<< "toogoo oruulna uu: ";
	int n;
	std::cin>>n;
	int too[n];
	for (int i = 0; i < n; i++) {
		too[i] = i + 1;
	}
	
	std::cout<< "1 ees " << n << "toonii niilber: " << std::endl;
	for (int i = 0; i < n; i++) {
		if (is_palindrome(too[i])) {
			std::cout<< too[i] << std::endl;
		}
	}
}
