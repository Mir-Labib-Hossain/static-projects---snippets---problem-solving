#include <stdio.h>
int main()
{
    int a,b,c;
    char x;
    float all=0;
    printf("Press A for addition.\n S for subtraction\n M for multiplication\n D for division.");
    scanf("%c",&x);

        if(x=='A' || x=='a')
    {
    printf("Enter 1st number:");
    scanf("%d",&a);
    printf("Enter 2nd number:");
    scanf("%d",&b);
    all=a+b;
    printf(" Addition is: %f",all);
    }
           else if(x=='S' || x=='s')
    {
    printf("Enter 1st number:");
    scanf("%d",&a);
    printf("Enter 2nd number:");
    scanf("%d",&b);
    all=a-b;
    printf(" Subtraction is: %f",all);
    }
           else if(x=='D' || x=='d')
    {
    printf("Enter 1st number:");
    scanf("%d",&a);
    printf("Enter 2nd number:");
    scanf("%d",&b);
    all=a/b;
    printf(" Division is: %f",all);
    }
           else if(x=='m' || x=='M')
    {
    printf("Enter 1st number:");
    scanf("%d",&a);
    printf("Enter 2nd number:");
    scanf("%d",&b);
    all=a*b;
    printf(" Multiplication: %f",all);
    }
         else{printf("wrong");}

}
