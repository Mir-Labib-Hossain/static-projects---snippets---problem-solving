#include <string.h>
int main()
{
char a[100],b[200];
int i,l,k;
printf("Enter 1st word : ");
scanf("%s",&a);
printf("Enter 2nd word : ");
scanf("%s",&b);
l=strlen(a);
k=strlen(b);
printf("\n%d lenght of %s\n",l,a);
printf("%d lenght of %s\n",k,b);
i=strcmp(a,b);
printf("\nCompareing : %d",i);

strcpy(a,b);
printf("\n%s\n",a);
if(l+k<100)
{
    strcat(a,b);
    printf("\n%s\n",a);
}
}
