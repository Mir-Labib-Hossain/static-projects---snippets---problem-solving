#include <stdio.h>
int main()
{
    int j, i, n=0, u=0, l=0, s=0,o=0;
    char  a[50];
    FILE *fp;
    fp=fopen("faculty.txt","r");

    while(fscanf(fp, "%c", &a[n]) != EOF)
    {
        n++;
    }
    for (i=0; i<n; i++)
    {
        if(a[i]>='A' && a[i]<='Z')
        {
            u++;
        }
        else if(a[i]>='a' && a[i]<='z')
        {
            l++;
        }
        else if(a[i]=' ')
        {
            s++;
        }
        else
        {
            o++;
        }
    }
    printf("Total upper case : %d\nTotal lower case : %d\nTotal space : %d\nOthers : %d",u,l,s,o);
}
