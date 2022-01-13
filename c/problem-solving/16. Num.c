#include <stdio.h>
int main()
{
    FILE *fo;
    fo=fopen("pramid.txt","w");
    int i,j,k,l;
    int num=1;
    int x=1;
    int row=5, space=row-3;
    for (i=1;i<=row;i++)
    {
        for (j=0;j<space;j++)
        {
            fprintf(fo," ");
        }
        int o=1;
        int n=((num*2)-1)/2;
        for (j=0;j<(num*2)-1;j++)
        {

            fprintf(fo,"%d",o);
            if (j>=n)o--;
            else o++;
        }
        fprintf(fo,"\n");
        if (i<3)
        {
            space--;
            num++;
        }
        else
        {
            space++;
            num--;
        }
    }
    fprintf(fo,"\n");
}
