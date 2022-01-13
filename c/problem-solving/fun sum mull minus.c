#include<stdio.h>

        float avg(int a, int b, int c)
{
    return (a+b+c)/3;
}


int sum(int a, int b, int c)
{
    return a+b+c;
}


int mul(int a, int b, int c)
{
    return a*b*c;
}

void ch(int a, int b, int c)
{
    char z;
    printf("Enter your choice\nS for sum,\nm for multiplication,\nV for average");
    scanf(" %c",&z);

    printf("%c",z);

    if(z=='s')
    {
        printf("Summation is : %d",sum(a,b,c));
    }
    else if(z=='m')
    {
        printf("Multiplication is : %d",mul(a,b,c));
    }

    else if(z=='V')
    {
        printf("Average : %f",avg(a,b,c));
    }
    else
    {
        printf("\nWrong");
    }

}
int main()
{
    int a,b,c;
    printf("Enter 3 value :\n");
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);
    ch(a,b,c);
    return 0;
}
