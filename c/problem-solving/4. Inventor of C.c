#include <stdio.h>
int main()
{
char a[50], b[]={"Dennis Ritchie"};
int i, j;
for(i=0; i<3; i++)
{
    printf("Who is the inventor of C ?\n");
    gets(a);
    j=strcmp(a,b);
    if(j==0)
       {
           printf("Good");
           return 0;
       }
       if(i==2)
        {
            return 0;
        }
       printf("TRY AGAIN-\n");
}
}
