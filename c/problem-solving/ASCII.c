#include <stdio.h>
int main()
{
    char c;
    int a;
    for(c='A'; c<'Z'; c++)
    {
        a=(int)c;
        printf("ASCII code for %c = %d \n",c,a);
    }

    for(c='a'; c<'z'; c++)
    {
        a=(int)c;
        printf("ASCII code for %c = %d \n",c,a);
    }

}
