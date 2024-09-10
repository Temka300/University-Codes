#include<stdio.h>
#include<string.h>
int main( )
{	char a[100], b[100];
   printf("Enter the first string\n");
   gets(a);
      printf("enter the second string\n");
   gets(b);
    if (strcmp(a,b)==0)
      printf("Entered strings are euqal\n");
    else
      printf("entered strings are not equal.\n");
  return 0;
}
