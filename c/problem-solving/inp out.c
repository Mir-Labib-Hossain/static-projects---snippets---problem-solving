#include <stdio.h>
int add(int *p1,int *p2)
{    printf("%d \n%d",*p1,*p2);

    int tem;
    tem=*p1;
    *p1=*p2;
    *p2=tem;
    printf("%d \n%d",*p1,*p2);
}


int main()
{
    int x,y;
    printf("Enter 1st number :");
    scanf("%d",&x);
    printf("Enter 2nd number :");
    scanf("%d",&y);
    add(&x,&y);
}

