#include <stdio.h>
int main()
{
    int i,j,k;
    FILE *fp;
    fp=fopen("updawnpyramid.txt","w");
    for(i=1; i<=5; i++)
    {
        for(j=2; j<=i; j++)
        {
            fprintf(fp," ");
        }
        for(k=5; k>=i; k--)
        {
            fprintf(fp,"A ");
        }
        fprintf(fp,"\n");
    }
}
