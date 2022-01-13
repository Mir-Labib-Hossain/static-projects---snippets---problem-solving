#include <stdio.h>
int main()
{

    int i,j,k;
    i=1;
    do
    {
        j=5;
        do
        {
            printf(" ");
            j--;
        }
        while(j>=i);
            k=1;
        do
        {
            printf("A");
        k++;
        }
        while(k<=2*i-1);
    i++;
    printf("\n");}
    while(i<=5);

}

#include <stdio.h>
int main()
{

    int i,j,k;
    i=1;
    do
    {
        j=5;
        do
        {
            printf(" ");
            j--;
        }
        while(j>=i);
            k=1;
        do
        {
            printf("A ");
        k++;
        }
        while(k<=i);
    i++;
    printf("\n");}
    while(i<=5);

}
