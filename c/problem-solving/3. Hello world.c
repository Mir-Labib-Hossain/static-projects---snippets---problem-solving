#include <stdio.h>
int main()
{
    char a[50], b[50];

    int al, bl, cm;
    printf("Enter 1st word :");
    scanf("%s",&a);
    printf("Enter 2nd word :");
    scanf("%s",&b);
    al=strlen(a);
    bl=strlen(b);
    printf("Lenght of %s is : %d\n",a,al);
    printf("Lenght of %s is : %d\n",b,bl);
    cm=strcmp(a,b);
    printf("Compare of %s and %s is %d\n",a,b,cm);
    if(al+bl<50)
    {

        printf("String contenate of %s and %s is ",a,b);
        strcat(a,b);
        printf("%s\n",a);
    }
    printf("Copy string %s to ",a);
    strcpy(a,b);
    printf("%s is %s",a,b);

}
