#include <stdio.h>
int main()
{
    char str[80],*p;
    printf("Enter a str");
    gets(str);
    p=str;
    while(*p)
    {
        *p=topper(*p);
        p++;
    }
    printf("%s \n",str);
}

