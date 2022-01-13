#include <stdio.h>
int main()
{
int a[10],i;
for (i=0; i<10; i++)
{
scanf("%d",&a[i]);
}
int min = a[0];
for (i=0; i<10; i++)
{
    if(a[i]<min)
    {
        min=a[i];
    }

}
printf("Minumum Number %d",a[i]);
}
