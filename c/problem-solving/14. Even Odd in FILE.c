#include <stdio.h>
int main()
{
    FILE *fp, *fe, *fo;
    int i, n=0, a[10];
    fp=fopen("Data.txt","r");
    fe=fopen("Eve.txt","w");
    fo=fopen("Odd.txt","w");
    do
    {
        n++;
    }while(fscanf(fp,"%d",&a[n]) != EOF);
    fclose(fp);
    for(i=0; i<n; i++)
    {
        if(a[i]%2 == 0)
        {
            fprintf(fe,"%d\n",a[i]);
        }
        else
        {
            fprintf(fo,"%d\n",a[i]);
        }
    }
    fclose(fe);
    fclose(fo);
}
