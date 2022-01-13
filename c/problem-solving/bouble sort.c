#include <stdio.h>
int main()
{
    int a[7]= {8,4,5,2,1,8,5};
    int i,j,t=0;
    for(i=0; i<7; i++)
    {
        for(j=0; j<7-1-i; j++)
        {
            if(a[j]>a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
    for(i=0; i<7; i++)
    {
        printf("%d ",a[i]);
    }
}
