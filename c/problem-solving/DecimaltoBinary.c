#include<stdio.h>
int main()
{
int a,f=0,c=0;
int ses;
int ar[10],i=0;
printf("Enter decimal number :");
scanf("%d",&a);
while(f==0)
{
    ses=a%2;
    ar[i]=ses;
    a=a/2;
    i++;
    c++;
    if(a==0)
    {
        f=1;
    }
}
for(i=c-1;i>=0;i--)
{
printf("%d",ar[i]);
}
}
