#include <stdio.h>
int main()
{
int i, a[100], n=0;
FILE *fp, *fo, *fe;
fp=fopen("cse.txt","r");
fe=fopen("cse.txt","w");
fo=fopen("cse.txt","w");
while(fscanf(fp, "%d", &a[n]!=EOF))
{
    n++;
}
for(i=0; i<n; i++)
{
    if(a[i]%2==0)
    {
        fprintf(fe,"%d\t",a[i]);
    }
    else
    {
        fprintf(fo,"%d\t",a[i]);
    }
}
}
