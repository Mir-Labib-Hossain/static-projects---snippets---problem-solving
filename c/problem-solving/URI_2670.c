#include <stdio.h>
int main()
{
    int a1, a2, a3, t1, t2, t3;

    scanf("%d",&a1);
    scanf("%d",&a2);
    scanf("%d",&a3);

    t1 = a2 * 2 + a3 * 4;
    t2 = a1 * 2 + a3 * 2;
    t3 = a1 * 4 + a2 * 2;

    if (t1 <= t2 && t1 <= t3)
    {
        printf("%d\n",t1);
    }
    else if (t2 <= t1 && t2 <= t3)
    {
        printf("%d\n",t2);
    }
    else if (t3 <= t1 && t3 <= t2)
    {
        printf("%d\n",t3);
    }
    return 0;
}
