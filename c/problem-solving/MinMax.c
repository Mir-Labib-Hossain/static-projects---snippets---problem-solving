#include <stdio.h>
int main()
{
    int length,i,arr;
    printf("Mir Labib Hossain (011183007)\nArray size : ");
    scanf("%d",&length);
    printf("Enter %d numbers : ",length);
    scanf("%d",&arr);
    int min = arr;
    int max = arr;
    for(i=1; i<length; i++)
    {
        if(min>arr)
            min=arr;
        if(max<arr)
            max=arr;
        scanf("%d",&arr);
    }
    printf("Min = %d\nMax = %d",min,max);
}


