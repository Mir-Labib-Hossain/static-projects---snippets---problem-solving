#include <stdio.h>
struct a{
int i;
char n[100];
float s;
};
int main()
{
    int i;
    struct a t[2];
    {
        for(i=0; i<2; i++)
        {

        printf("Enter your Name : ");
        scanf("%s",t[i].n);
        printf("Enter your number : ");
        scanf("%d",&t[i].i);
        printf("Enter your gpa : ");
        scanf("%f",&t[i].s);
        }
    }
 for(i=0; i<2; i++)
 {
     printf("Name : %s\nID : %d\nGPA : %f",t[i].n, t[i].i, t[i].s);
}

}


