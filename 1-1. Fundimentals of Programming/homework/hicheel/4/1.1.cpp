#include<stdio.h>
#include<string.h>
int main() 
{	char a[100], b[100];
	printf("Enter the string to check if it is is a palindrome\n");
	gets(a);
	strcpy(b, a);
	strrev(b);
	if(strrev(b))
	printf("Entered string is a palindrome.\n");
	else
	printf("Entered string is not a palindrome.\n");
	return 0;
}
