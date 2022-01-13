#include <stdio.h>
int main()
{
    int u=0, l=0, s=0, o=0;
    int i, j;
    char a[50];
    printf("Enter a word : ");
    gets(a);
    j = strlen(a);
    for(i=0; i<j; i++)
    {
        if (a[i]>='A' && a[i]<='Z')
        {
            u++;
        }
        else if(a[i]>='a' && a[i]<='z')
        {
            l++;
        }
        else if(a[i]==' ')
        {
            s++;
        }
        else
        {
            o++;
        }
}
printf("Total upper case = %d\nTotal lower case = %d\nTotal space = %d\nTotal Others = %d",u,l,s,o);
}
