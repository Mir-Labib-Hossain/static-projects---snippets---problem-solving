#include <stdio.h>
struct student_information
{
    int Student_ID, Age;
    char Name[50], Address[50];
};
    int main()
{
    struct student_information s[2];
    int i;
    for(i=0; i<2; i++)
    {
        printf("Enter Students name : ");
        scanf("%s",&s[i].Name);
        printf("Enter studentd id : ");
        scanf("%d",&s[i].Student_ID);
        printf("Enter students age : ");
        scanf("%d",&s[i].Age);
        printf("Enter Studentf Address : ");
        scanf("%s",&s[i].Address);
    }
    for(i=0; i<2; i++)
    {
        printf("\nEnter Students name : %s\nEnter student id : %d \nEnter students age : %d\nEnter Student Address : %s",s[i].Name, s[i].Student_ID, s[i].Age,s[i].Address);
    }
}
