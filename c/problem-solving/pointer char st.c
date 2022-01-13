#include <stdio.h>
int main()
{
    char st[100], *p;
    printf("Enter a string : ");
    gets (st);
    p=st;
    while (*p)
    {

        *p=toupper(*p);
    }
    printf("%s\n",st);
}
