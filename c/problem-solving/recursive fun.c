#include <stdio.h>
int fac(int x)
{
    if(x==1)
    {
        return 1;
    }
    else{
        return x*fac(x-1);
    }
}
int main()
{
    int a;
    printf("Enter a number :");
    scanf("%d",&a);
    printf("%d",fac(a));
}
