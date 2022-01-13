#include <stdio.h>
int main ()
{
int n,i,j;
printf("enter range");
scanf("%d",&n);
for(i=2;i<=n;i++)
{
    for (j=2;j<=i;j++)
    {
        if(i%j==2)
            break;
    }
    if(i==j)
    {
        printf("%d")
    }
}\
#include<stdio.h>
int main()
{
int first =0, second =1,fibo,n,i;
printf ("enter range ");
scanf("%d",&n);
for (i=0;i<n;i++)
{
    if(i<=1)
    {
        fibo=i;
    }
    else
    {
        fibo=first+second;
        first=second;
        second=fibo;
    }
    printf("%3d",fibo);
}
}
