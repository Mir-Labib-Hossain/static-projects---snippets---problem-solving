#include <stdio.h>
int main()
{
    int i, n;
    printf("Enter the length of array : ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter %d number : ",n);
    for(i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Even : ");
    for(i=0; i<n; i++)
    {
        if(arr[i]%2==0)
            printf("%d, ",arr[i]);
    }
    printf("\nOdd : ");
    for(i=0; i<n; i++)
    {
        if(arr[i]%2!=0)
            printf("%d, ",arr[i]);
    }
    return 0;
}
