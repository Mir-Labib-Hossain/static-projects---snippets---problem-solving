#include <stdio.h>
int main()
{
    int n, i,j;
    FILE *fp;
    fp=fopen("number pyramid.txt","w");
    printf("Enter number : ");
    scanf("%d", &n);
    for(i=1; i<=n; i++)
    {
        for(j=1; j<=i; j++)
        {
        fprintf(fp,"%d ",j);
        }
        fprintf(fp,"\n");
    }
}