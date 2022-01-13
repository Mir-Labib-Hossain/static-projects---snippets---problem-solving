#include <stdio.h>
int main()
{
    int i,n=0,m=1,o=1,c;
    printf("Enter how many number you want");
    scanf("%d",&c);
    for(i=1;i<=c;i++)
    {
        printf("%4d",n);
        o=n+m;
        n=m;
        m=o;
    }
}
