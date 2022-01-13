#include <stdio.h>
int main()
{
    int z, a, b, c, d, e, f, g;
    scanf("%d" , &z);
    a=z/100;
    z=z%100;
    b=z/50;
    z=b%50;
    c=z/20;
    z=z%20;
    d=z/10;
    z=z%10;
    e=z/5;
    z=z%5;
    f=z/2;
    z=z%2;
    g=z/1;

    printf("%d %d %d %d %d %d %d",a,b,c,d,e,f,g);

}
