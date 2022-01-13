#include<stdio.h>
int max(int a, int b, int c)
{
if (a>b && a>c)
{
return a;
}
else if(b>a && b>c)
{
return b;
}
else
{
return c;}
}
float av(int a ,int b,int c)
{
    return (a+b+c/4);
}
char choice (int a, int b, int c)
{
    char d;
    printf("Press a for Average\nPress m for Maximum\nPress n for Minimum\n");
    scanf("%c",d);
    if(d='a')
    {
        printf("Average : %.4f",av);
    }
    else if(d='m')
    {
    printf("Maximum : %d",max(a,b,c));
    }
    else
    {
    printf("wrong");
    }

int main()
{
int a,b,c;
char d;
printf("Enter a number:");
scanf("%d",&a);
printf("Enter a number:");
scanf("%d",&b);
printf("Enter a number:");
scanf("%d",&c);
choice (a,b,c);
}
