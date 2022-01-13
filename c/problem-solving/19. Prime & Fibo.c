#include <stdio.h>
int main()
{

    int i, j, n[10], f=0;
    char c;
    printf("Press p for primr\npress f for fibbonaci");
    scanf("%c",&c);
    if(c=='p')
    {
    for(i=0; i<10; i++)
    {
      printf("Enter %d number : ",i+1);
    scanf("%d",&n[i]);
     }
     for(i=0; i<10; i++)
    {
        for(j=2; j<=n[i]/2; j++)
        {
            if(n[i]%j==0)
            {
                f=1;
            }
        }
        if(n[i]==1)
        {
            printf("%d is not prime number .",n[i]);
        }
        else{
            if(f==0)
            {
                printf("%d is prime number .",n[i]);
                f=0;
            }
            else
                {
                   printf("%d is not prime number .",n[i]);
            f=0;
            }
        }
    printf("\n");
}
    }
else
{
 int i, n,n1=0 ,n2=1, n3;
printf("Enter a number :");
scanf("%d",&n);
for(i=1; i<=n; i++)
{
    if(i == 1)
    {
        printf("%d ",n1);
    }
    else if(i == 2)
    {
        printf("%d ",n2);
    }
    else
    {
        n3=n1+n2;
        printf("%d ",n3);
        n1=n2;
        n2=n3;
    }
}
return 0;

}

}
