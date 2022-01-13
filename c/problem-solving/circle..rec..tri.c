#include <stdio.h>
int main()
{
    int i ,b ,c=0;
    char a;
    printf("Menu:\n    Press C: Circle\n    Press T: Triangle\n    Press R: Rectangle\nEnter your choice:");
    scanf("%c",&a);
if( a=='C' )
{
    printf("Enter the value of radius:");
    scanf("%d",&i);
    c=i*i*3.1416;
    printf("Area of circle:%d",c);
}
else if( a=='T' )
{
    printf("Enter the value of hight:");
    scanf("%d",&i);
    printf("Enter the value of base:");
    scanf("%d",&b);
    c=i*b;
    printf("Area of circle:%d",c/2);
}
else if( a=='R' )
{
    printf("Enter the value of length:");
    scanf("%d",&i);
    printf("Enter the value of width:");
    scanf("%d",&b);
    printf("Area of circle:%d",i*b);
}
else
{
    printf("Wrong keyword");
}
return 0;
}
