#include <stdio.h>
int main()
{

    int i, j, k;
    int c, b;
    FILE *fp;
    fp=fopen("DiamondAbidV.txt","w");
    start :
    printf("Enter a odd number :");
    scanf("%d", &c);
    if(c%2==0)
    {
        printf("\nEntered number isn't a ODD number !\nTry again : \n");
    goto start;
    }
    else if(c%2!=0)
    {
        b=c/2;
        printf("\nEntered number is a ODD number !\n");
        for(i=1; i<=b+1; i++)
        {
            for(j=b; j>=i; j--)
            {
                fprintf(fp, " ");
            }
            for(k=1; k<=2*i-1; k++)
            {
                fprintf(fp, "*");
            }
            fprintf(fp, "\n");
        }
        for(i=1; i<=b; i++)
        {
            for(j=1; j<=i; j++)
            {
                fprintf(fp, " ");
            }
            for(k=b*2-1; k>=2*i-1; k--)
            {
                fprintf(fp, "*");
            }
            fprintf(fp, "\n");
        }
    }
}
