#include<stdio.h>
#include<string.h>
void reverse_string(char*);
void reverse_words(char*);
int main( )
{	char  a[100], b[1000];
    printf("Enter the first string \n");
     gets(a);
    printf("Enter the second string \n");
     gets(b);
     strcat(a, b);
    printf("String obtained on concatenation is %s \n",a);
return 0;
}
