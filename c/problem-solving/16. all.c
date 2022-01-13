#include <stdio.h>
int fa(int n)
{
    if(n==1)
    {
        return 1;
    }
    else{
        return n*fa(n-1);
    }
}
int main()
{

int a=4;
printf("%d",fa(a));
}
