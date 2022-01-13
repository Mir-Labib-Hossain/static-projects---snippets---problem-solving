#include <stdio.h>
int main()
{
    int i, j;
    char a[50], ch;
    printf("Enter a word : ");
    scanf("%s",&a);
    j=strlen(a);
    for(i=0; i<j; i++)
    {
        if(a[i]>='A' && a[i]<='Z')
        {
            ch=a[i]+32;
            printf("%c",ch);
        }
        else
        {
            printf("%c",a[i]);
        }
    }
}
