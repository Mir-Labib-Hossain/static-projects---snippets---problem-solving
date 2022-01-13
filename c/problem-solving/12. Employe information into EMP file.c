#include <stdio.h>
struct employe{
char name[50];
int tele;
float work;
};
int main()
{
int i;
FILE *fp;
fp=fopen("EMP.txt","w");
    struct employe e[10];
for(i=0; i<10; i++)
{
    printf("Enter Employee NAME : ");
    scanf("%s",&e[i].name);
    printf("Enter TELEPHONE NUMBER : ");
    scanf("%d",&e[i].tele);
    printf("Enter HOURLY WORK : ");
    scanf("%f",&e[i].work);
}
for(i=0; i<10; i++)
{
fprintf(fp,"\nEmployee name : %s\nNumber : %d\nWork time : %f\n",e[i].name,e[i].tele,e[i].work);
}
}
