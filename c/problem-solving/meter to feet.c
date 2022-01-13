#include <stdio.h>
int main()
{
    int a;
    float b;
    printf("Convert:\n    1.Feet to Meters\n    2.Meters to Feet\n    3.Ounces to Pounds\n    4.Pounds to Ounces\nEnter the number of your choice:");
    scanf("%d",&a);
if( a==1 )
{
    printf("Enter feet:");
    scanf("%f",&b);
    printf("Meters:%.2f",b/3.28);
}
else if( a==2 )
{
    printf("Enter Meter:");
    scanf("%f",&b);
    printf("Feet:%.2f",b*3.28);

}
else if( a==3 )
{
    printf("Enter Ounces:");
    scanf("%f",&b);
    printf("Pounds:%.2f",b/16);
}
else if( a==4 )
{
    printf("Enter feet:");
    scanf("%f",&b);
    printf("Meters:%.2f",b/16);
}
else
{
    printf("Wrong Number");
}
return 0;
}
