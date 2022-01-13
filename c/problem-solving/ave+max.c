#include <stdio.h>
int main()
{
int b,c,d,f,total,A;
char y;
    printf("Press 'A' or 'a' for average\nor \nPress 'M' or 'm' for Maximum\n:");
    scanf("%c", &y);
if(y=='M' || y=='m')
    {
    printf("Enter your mark of Sub-1:");
    scanf( "%d" , &b);
    printf("Enter your mark of Sub-2:");
    scanf( "%d" , &c);
    printf("Enter your mark of Sub-3:");
    scanf( "%d" , &d);
    printf("Enter your mark of Sub-4:");
    scanf( "%d" , &f);

        if(b>c && b>d && b>f)
        {
            printf("Sub-1 is Maximum.");
        }
        else if(c>b && c>d && c>f)
        {
            printf("Sub-2 is Maximum.");
        }
        else if(d>b && d>c && d>f)
        {
            printf("Sub-3 is Maximum.");
        }
        else if(f>b && f>c && f>d)
        {
            printf("Sub-4 is Maximum.");
        }
        else
        {
            printf("All marks are same.");
        }
}
else if (y=='A' || y=='a')
{
    printf("Enter your mark of Sub-1:");
    scanf( "%d" , &b);
    printf("Enter your mark of Sub-2:");
    scanf( "%d" , &c);
    printf("Enter your mark of Sub-3:");
    scanf( "%d" , &d);
    printf("Enter your mark of Sub-4:");
    scanf( "%d" , &f);
    total=b+c+d+f;
    A=total/4;
    printf("Average: %d",A);
}
else
{
    printf("Sorry,You have entered wrong keyword");
}
    return 0;
}


