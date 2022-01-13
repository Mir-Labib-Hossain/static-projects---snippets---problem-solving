#include <stdio.h>
int main()
{
    int n;
    printf( "enter a number");
    scanf("%d",&n);
    int a[n],b[n],m[n],i=0;
    do{
        printf("enter number");
        scanf("%d",&m[i]);
        i++;
    }
    while(i<n);
     for(i=0;i<n;i++)
     {
         if(m[i]%2==0)
        {
            a[i]=m[i];
            printf("%3d \n",a[i]);
        }
        else
        {
            b[i]=m[i];
            printf("%3d \n",b[i]);
        }
     }
}
