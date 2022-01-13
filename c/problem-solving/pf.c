#include <stdio.h>
int main()
{

    int n[10];
    char c;
    printf("");
    int i, j, f=0;
    for(j=0; j<10; j++)
    {
    printf("Enter a number : ");
    scanf("%d",&n[j]);
    }
    for(j=0; j<10; j++)
    {
    for(i=2; i<=(n[j]/2); i++)
    {
        if(n[j]%i==0)
        {
            f=1;
            break;
        }
    }
    if(n[j]==1)
    {
        printf("1 is not Prime number.");
    }
    else
        {
        if(f==0)
        {
            printf("%d is Prime number.",n[j]);
            f=0;
        }
        else
        {
            printf("%d is not a Prime number.",n[j]);
            f=0;
        }
}

printf("\n");
    }
}

