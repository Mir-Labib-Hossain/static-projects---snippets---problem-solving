#include <stdio.h>
int main()
{
int i,j,k;
i=1;
while(i<=4)
{
j=4;
while(j>=i)
{
printf("-");
j--;
}
k=1;
while(k<=(2*i-1))
{
printf(" ");
k++;
}
j=4;
while(j>=i)
{

    printf("-");
    j--;
}

i++;
printf("\n");
}
i=1;
while(i<=3)
{
    j=0;
    while(j<=i)
    {
        printf("-");
        j++;
    }
    k=5;
    while(k>=(2*i-1))
    {
        printf(" ");
        k--;
    }
    j=0;
while(j<=i)
{

    printf("-");
    j++;
}
    i++;
    printf("\n");
}
}
