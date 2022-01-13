#include <stdio.h>
void swap(int *i, int *j)
{
    int tm=0;
    tm=*i;
    *i=*j;
    *j=tm;
    printf("After swapping\n1st value : %d\t2nd value : %d",*i,*j);
}
int main()
{
    int a,b;
    printf("Enter 1st value : ");
    scanf("%d",&a);
    printf("Enter 2nd value : ");
    scanf("%d",&b);

    printf("Before swapping\n1st value : %d\t2nd value : %d\n",a,b);
   swap2(a,b);
printf("after swapping\n1st value : %d\t2nd value : %d\n",a,b);

}
