#include <stdio.h>
struct tel{
int number;
char name[100];
};
int main ()
{
    int i;
    struct tel t[2];
    for (i=0; i<2; i++)
    {
        printf("Enter your name : ");
        scanf("%s",t[i].name);

        printf("Enter your number : ");
        scanf("%d",&t[i].number);

    }
}
