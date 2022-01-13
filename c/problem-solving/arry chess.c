#include<stdio.h>
int main()
{
    int chess[8][8];
    int i, j, num=1;
    int input;
    for (i=0; i<8; i++)
    {
        for(j=0; j<8; j++)
        {
            if(i%2==0 && j%2==0)

                printf("White\t");

            else if(i%2!=0 && j%2!=0)

                printf("White\t");
            else
                printf("Black\t");
        }
        printf("\n");
        printf("\n");
        printf("\n");
        printf("\n");
    }
    getch();
}
