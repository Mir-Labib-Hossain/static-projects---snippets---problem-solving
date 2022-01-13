#include <stdio.h>
int main()
{
    int a, b, c, d, e, f, g;
    scanf("%d %d %d", &a, &b, &c);
    if(a<b && a<c)
    {
        printf("%d\n",a);
        d=a;
        e=b;
        f=c;
    }
    else if(b<a && b<c)
    {
        printf("%d\n",b);
        d=b;
        e=a;
        f=c;
    }
    else
    {
        printf("%d\n",c);
        d=c;
        e=b;
        f=a;
    }
    if (a>d && (a<e || a<f))
    {
        printf("%d\n",a);
        e=a;
    }
    else if(b>d && (b<e || b<f))
    {
        printf("%d\n",b);
        e=b;
    }
    else
    {
        printf("%d\n",c);
        e=c;
    }
    if(a>d && a>e)
    {
        printf("%d\n",a);
    }
    else if(b>d && b>e)
    {
        printf("%d\n",b);
    }
    else
    {
        printf("%d\n",c);
    }
    printf("\n%d\n%d\n%d\n",a,b,c);
}
