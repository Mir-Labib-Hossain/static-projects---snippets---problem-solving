#include <stdio.h>
int main()
{
int a,b,s,m;
char c;
printf("Press S to calculate summation of two numbers:\nPress M to calculate multiplication of two numbers:\n");
scanf("%c",&c);
if ( c=='S' )
{
printf("Enter 1st number:");
scanf("%d",&a);
printf("Enter 2nd number:");
scanf("%d",&b);
s=a+b;
printf("Summation is:%d",s);
}
else if( c=='M' )
{
printf("Enter 1st number:");
scanf("%d",&a);
printf("Enter 2nd number:");
scanf("%d",&b);
m=a*b;
printf("Multiplication:%d",m);
}
else
{
printf("Wrong");
}
return 0;
}
