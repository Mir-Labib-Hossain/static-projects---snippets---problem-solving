#include <stdio.h>
int main()
{
     int *p, i,n ;
    printf("Enter array size : ");
    scanf("%d", & n);
    int a[n];
    for(i=0; i<n; i++)
    {
        printf("Enter array No. %d : ",i);
        scanf("%d", &a[i]);
    }
    printf("Array's are :\n");
    for(i=0; i<n; i++)
        {
            p=a[i];
            printf("%d\n",p);
        }
    }
