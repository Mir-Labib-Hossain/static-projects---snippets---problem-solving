#include <stdio.h>
struct student_information {
char name[40],address[50];
int id,age;
};
int main()
{
        FILE *a;
    a=fopen("EMP.txt","w");
    struct student_information s[2];
    int i;
        for(i=0;i<2;i++)
    {
        scanf("%s",&s[i].name);
        scanf("%d",&s[i].age);
    }
    for(i=0;i<2;i++)
    {
        fprintf(a,"%s is name \n %d is age \n",s[i].name,s[i].age);
    }


}

