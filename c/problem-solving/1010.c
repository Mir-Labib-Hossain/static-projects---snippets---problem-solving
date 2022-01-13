#include <stdio.h>
int main()
{
int a,b,c,d;
float e,f,g;
scanf("%d %d %f",&a,&b,&e);
scanf("%d %d %f",&c,&d,&f);
g=(d*f)+(b*e);
printf("VALOR A PAGAR: R$ %.2f\n",g);
}
