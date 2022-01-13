#include <stdio.h>
int main()
{

    double pi=3.14159,a,b,c,rt=0,cir=0,tra=0,sq=0,rec=0;
    scanf("%lf",&a);
    scanf("%lf",&b);
    scanf("%lf",&c);
    rt=.5*a*c;
    cir=pi*c*c;
    tra=((a+b)/2)*c;
    sq=b*b;
    rec=a*b;
printf("TRIANGULO: %.3lf\n",rt);
       printf("CIRCULO: %.3lf\n",cir);
              printf("TRAPEZIO: %.3lf\n",tra);
                     printf("QUADRADO: %.3lf\n",sq);
                            printf("RETANGULO: %.3lf\n",rec);
}
