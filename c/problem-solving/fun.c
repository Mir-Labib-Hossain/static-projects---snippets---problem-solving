#include <Stdio.h>
float tri(int a, int b)
{
    return .5*a*b;
}

main()
{
    int base,height;
    printf("Enter base");
    scanf("%d",&base);
    printf("Enter height");
    scanf("%d",&height);
    printf("Area of triangle : %f",tri(base,height));
    tri(base,height);
    }
