#include<stdio.h>
int main()
{
    int i,j;
    for(i=0; i<7; i++)
    {
        for (j = 0; j < 39; j++)
        {
            if (i == 0 || i == 6)
            {
                printf("-");
            }
            else if (j == 0 || j == 38)
            {
                printf("|");
            }
            else if (i == 1)
            {
                switch (j)
                {
                case 9:
                    printf("R");
                    break;
                case 10:
                    printf("o");
                    break;
                case 11:
                    printf("b");
                    break;
                case 12:
                    printf("e");
                    break;
                case 13:
                    printf("r");
                    break;
                case 14:
                    printf("t");
                    break;
                case 15:
                    printf("o");
                    break;
                default:
                    printf(" ");
                    break;
                }
            }
            else if (i == 3)
            {
                switch (j)
                {
                case 9:
                    printf("5");
                    break;
                case 10:
                    printf("7");
                    break;
                case 11:
                    printf("8");
                    break;
                case 12:
                    printf("6");
                    break;
                default:
                    printf(" ");
                    break;
                }
            }
            else if (i == 5)
            {
                switch (j)
                {
                case 9:
                    printf("U");
                    break;
                case 10:
                    printf("N");
                    break;
                case 11:
                    printf("I");
                    break;
                case 12:
                    printf("F");
                    break;
                case 13:
                    printf("E");
                    break;
                case 14:
                    printf("I");
                    break;
                default:
                    printf(" ");
                    break;
                }
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
    return 0;
}
