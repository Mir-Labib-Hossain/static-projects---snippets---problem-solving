#include <stdio.h>
void tri(int *i, int *j)
{
    printf("Area of Triangle : %f\n",(float)(*i)*(*j) /2 );
}
void cir(int *i)
{
    printf("Area of Circle : %f\n",(float)(3.14159*(*i)*(*i)));
}
void sq(int *i)
{
    printf("Area of Square : %d\n",((*i)*(*i)));
}
int main()
{
    int a, b;
    printf("Enter 1st value : ");
    scanf("%d",&a);
    printf("Enter 2nd value : ");
    scanf("%d",&b);
    tri(&a,&b);
    cir(&a);
    sq(&a);


}


