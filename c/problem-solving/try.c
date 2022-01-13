#include <stdio.h>
int main()
{
    char a[100];
    int i, x;
    gets(a);
    i=0;
    x=strlen(a)-1;
    while(i<=x)
    {
        if(i<x)
        {
            printf("%c %c",a[i],a[x]);
        }
        else
        {
            printf("%c",a[i]);
        }
        i++;
        x--;
    }
}
