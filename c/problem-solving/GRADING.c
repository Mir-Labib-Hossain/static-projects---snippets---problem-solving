#include<stdio.h>
int main()
{
    int a;
    //Comment some thing
    printf("Enter your number:");
    scanf("%d",&a);
if (a>=0 && a<=32)
    {
    printf("Grade F");
    }
else if (a>=33 && a<=40)
    {
    printf("Grade D");
    }
else if (a>=41 && a<=50)
    {
    printf("Grade C");
    }
else if (a>=51 && a<=60)
    {
    printf("Grade B");
    }
else if (a>=61 && a<=70)
    {
    printf("Grade A-");
    }
else if (a>=71 && a<=80)
    {
    printf("Grade A");
    }
else
    {
    printf("Grade A+");
    }
return 0;
}
