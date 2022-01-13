
#include <stdio.h>
#include <string.h>

int main()
{
    int test, i;
    double a, b, c, sum;
    scanf("%d",&test);
    for (i = 0; i < test; i++)
    {
        scanf("%lf %lf %lf",&a, &b, &c);
        sum = (a + b + c) / 2;
        sum = sqrt(sum * (sum - a) * (sum - b) * (sum - c));
        printf("Case %d: %.10f\n",(i+1), sum);
    }
    return 0;
}

