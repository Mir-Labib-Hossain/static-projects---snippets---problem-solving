#include <stdio.h>
void r(char a[])
{
strrev(a);
printf("%s",a);
}


main()
{
char a[100]="labib labib";
r(a);
}
