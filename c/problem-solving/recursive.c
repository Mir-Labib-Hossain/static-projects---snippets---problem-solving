#include <stdio.h>
int r(int i)
{
    if(i<10)
    {
        printf("%d\t",i);
        r(i+1);
    }
}
main()
{
int i;
    scanf("%d",&i);
    r(i);
}
