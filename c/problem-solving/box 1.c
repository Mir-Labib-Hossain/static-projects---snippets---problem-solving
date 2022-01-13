#include <stdio.h>
int main()
{
    int a,b,c,i;
    printf("Enter a number : ");
    scanf("%d",&a);
    c=a;
    for(i=1; i<=c; i++)
    {
        if(i==1)
        {
            b=a*a;
            printf("\n%d cm = %d Box\n",i,b);
        }
        if(i==2)
        {
            a=a-1;
            b=a*a;
            printf("%d cm = %d Box\n",i,b);
        }
        if(i==3)
        {
            a=a-1;
            b=a*a;
            printf("%d cm = %d Box\n",i,b);
        }
        if(i==4)
        {
            a=a-1;
            b=a*a;
            printf("%d cm = %d Box\n",i,b);
        }
        if(i==5)
        {
            a=a-1;
            b=a*a;
            printf("%d cm = %d Box\n",i,b);
        }
    }
}
