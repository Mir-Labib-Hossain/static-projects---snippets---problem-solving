#include <stdio.h>
int main()
{
    int a,b,c,i,t=0;
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
        else
        {
            a=a-1;
            b=a*a;
            printf("%d cm = %d Box\n",i,b);
        }
        t=t+b;
    }
    printf("\nTotal Box : %d\n",t);
}
