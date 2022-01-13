#include<stdio.h>
int main()
{
    char a;
    printf("enter a character");
    scanf("%c", &a);
    if (a == 'r' || a == 'R')
        {
        printf("colour is RED");
        }
    else if (a == 'g' || a == 'G')
        {
         printf("colour is GREEN");
        }
    else if (a == 'b' || a == 'B')
        {
        printf("colour is BLUE");
        }
    else
        {
        printf("colour is black");
        }
return 0 ;
}
