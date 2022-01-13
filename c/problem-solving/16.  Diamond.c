#include <stdio.h>
int main()
{
    int i, j, k;
    FILE *fp;
    fp=fopen("diamondSpace.txt","w");
    for(i=1; i<=4; i++)
    {
        for(j=3; j>=i; j--)
        {
            fprintf(fp," ");
        }
        for(k=1; k<=i; k++)
        {
            fprintf(fp,"* ");
        }
        fprintf(fp,"\n");
    }

}
