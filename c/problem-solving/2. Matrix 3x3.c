#include <stdio.h>
int main()
{
    int a[3][3], b[3][3], ab[3][3];
    int i, j, k, sum=0;
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            printf("Enter [%d%d] value of 1st 2d array:",i,j);
            scanf("%d",&a[i][j]);
        }
    }
    printf("\n");
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            printf("Enter [%d%d] value of 2nd 2d array:",i,j);
            scanf("%d",&b[i][j]);
        }
    }

    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            for(k=0; k<3; k++)
            {
            sum=sum+a[i][k]*b[k][j];
            }

            ab[i][j]=sum;
            sum=0;
        }
    }
    printf("Matrix is :\n");
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
        {
            printf("%d\t",ab[i][j]);
        }
        printf("\n");
    }

}
