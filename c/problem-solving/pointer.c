#include <stdio.h>
int main()
{
    int *p,i;
    p=&i;
    i=1;
    printf("%p %p",p,i);
    (*p)++;
    printf("\n%p %p",p,i);
    }
