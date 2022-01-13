#include <stdio.h>
void sw(int x, int y)
{
    int *p1, *p2, temp;
    p1=&x;
    p2=&y;
    temp = *p1;
    *p1 = *p2;
    *p2 = temp;
    printf("After swapping value of \nA is : %d\tB is : %d",*p1,*p2);
    getch();
}
main()
{
    int a,b;

    printf("Enter value for A : ");
    scanf("%d",&a);
    printf("\nEnter value for B : ");
    scanf("%d",&b);
    printf("Before swapping valur of \nA is : %d\tB is :%d\n",a,b);
    sw(a,b);

}
