#include <stdio.h>
int max(int a, int b ,int c)
{
    if(a>b && a>c)
    {
        return a;
    }
    else if(b>a && b>c)
    {
        return b;
    }
    else
    {
        return c;
    }
}
float avg (int x, int y, int z)
{
    return (x+y+z)/3;
}
int min ( int e, int f, int g)
{
        if(e<f && e<g)
    {
        return e;
    }
    else if(f<e && f<g)
    {
        return f;
    }
    else
    {
        return g;
    }
}
int choice(int j,int k ,int l)
{
    char o;
    printf("enter your choice\n a for average\nm for maximum\nnfor minimum");
     scanf("%c", &o);
    if(o=='a')
    {
        printf("%f", avg(j,k,l));
    }
    else if (o=='m')
    {
        printf("%d", max(j,k,l));
    }
    else if (o=='n')
    {
     printf("%d", min(j,k,l));
    }
    else
    {
        printf("wrong input");
    }
}
main()
{
    int a=3,b=6,c=9;
    choice (a,b,c);
}
