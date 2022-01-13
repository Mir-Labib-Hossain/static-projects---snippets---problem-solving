#include<stdio.h>
int main()
{
    int n[10], i, j, n1=-1, n2=0, n3=n1+n2;
    for (i=0; i<10; i++)
    {
        printf("Enter a number :");
        scanf("%d",&n[i]);
    }
    for (i=0; i<10; i++)
    {
        for(j=0; j<n[i]; j++)
        {
            n1++;
            n2++;
            n3=n1+n2;
        }

            if(n3==n[i])
            {
                printf("%d is a Fibo number.\n",n[i]);
                n1=0, n2=1, n3=n1+n2;
            }
           else if( n3!=n[i])
        {
            printf("%d is not a fibo number.\n",n[i]);
            n1=0, n2=1, n3=n1+n2;
        }

    }
}



