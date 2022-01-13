#include <stdio.h>
int main ()
{
    int sum=0,i,j,k,a[10];
    char c;
    float av;
    printf("a for average\n m for maximum");
    scanf("%c",&c);
    printf("Enter 10 number :");
    for(i=0; i<10; i++)
    {
        scanf("%d",&a[i]);
    }
    if (c=='a')
    {
        for(i=0; i<10; i++)
        {
            sum=a[i]+sum;
        }
        av=sum/10;
        printf("Average : %f",av);
    }
    else
    {
        int max=a[0];
        for(i=0; i<10; i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        printf("Maximum number : %d",max);
    }
}

