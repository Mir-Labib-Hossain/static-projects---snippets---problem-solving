#include <stdio.h>
int main()
{
    int i,j,length,t;
    printf("Mir Labib Hossain (011183007)\n");
    int arr[7] = {1,0,4,2,6,8,10};
    for(i = 0; i < 7; i++)
    {
        for(j=0; j<7-1-i; j++)
        {
            if(arr[j]>arr[j+1])
            {
                t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }

        }
    }
    printf("After Bubble Sort : %d",arr[0]);
    for(i = 1; i < 7; i++)
    {
        printf(", %d",arr[i]);
    }
}
