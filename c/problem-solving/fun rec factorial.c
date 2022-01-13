#include <stdio.h>
int f(int a)
{
        if(a==1)
        {
            return 1;

        }
        else
        {
            return a*f(a-1);

        }
}
main()
{

    int a;
    scanf("%d",&a);
    printf("%d",f(a));
    f(a);
}

