#include <stdio.h>
int main()
{
    int i,j,k;
    i=1;
    do
    {
        j=4;
        do
        {
            printf(" ");
            j--;
        }while(j>=i);
        k=1;
        do
        {
            printf("*");
            k++;
        }while(k<=(2*i-1));
        printf("\n");
        i++;
    }while(i<=5);
}
