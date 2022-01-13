#include <stdio.h>
void f1(int b);
void f2(int a);

main()
{
    f1(30);
}
void f1(int a)
{
    if(a)
    {
        f2(a-1);
        printf("%d ",a);
    }
}
void f2(int b)
{

    printf(". ");
    if (b)
    {

        f1(b-1);
    }
    printf("\n");
}
