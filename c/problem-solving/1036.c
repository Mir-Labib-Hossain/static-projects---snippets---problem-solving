#include <stdio.h>
#include <math.h>
int main()
{
    double a, b, c, s, sq, d, e;
    scanf("%lf %lf %lf", &a, &b, &c);
    sq=(pow(b,2)-(4*a*c));
    d=(-b+sqrt(sq))/(2*a);
    e=(-b-sqrt(sq))/(2*a);
    if(a!=0 && d<0 )
    {
        printf("R1 = %.5lf\nR2 = %.5lf\n",d,e);
    }
    else
    {
        printf("Impossivel calcular\n");
    }
}
