#include <stdio.h>
struct telephone_index
{
    char name[50], add[50];
    int num, fax;
};


int main()
{
    int i;
struct telephone_index t[2];
for(i=0; i<2; i++)
{
    printf("Enter Customers NAME : ");
    scanf("%s",&t[i].name);
    printf("Enter Telephone Number : ");
    scanf("%d",&t[i].num);
    printf("Enter FAX No. : ");
    scanf("%d",&t[i].fax);
    printf("Enter Address : ");
    scanf("%s",&t[i].add);
}
for(i=0; i<2; i++)
{
    printf("Customers name : %s\nTelephone Number : %d\nFax No. : %d\nAddress : %s",t[i].name, t[i].num, t[i].fax, t[i].add);
}
}
