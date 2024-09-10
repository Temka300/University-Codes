#include<stdio.h>
#include<string.h>
int main( )
{	char  st[100];
	printf("Enter a string to reverse \n");
	  gets(st);     //Temdegtiin utgiig avna.
	  strrev(st);   //Temdegtiin araas ni uragshaa tongoruulna.
	printf("Reverse of entered string is \n%s\n", st);
return 0;
}
