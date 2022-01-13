#include<stdio.h>
int main()
{
    char a;
    float b,c,d,e;
    scanf("%s",&a);
    printf ("enter sallary and product price");
    scanf("%f%f",&b,&c);
    d=(c*15)/100;
    e=d+b;
    printf("TOTAL RS %0.6f",e);
}

