#include <stdio.h>
int main()
{
    char s1[50]={"University"}, s2[50]="Faculty", s3[50]="Engenering";
    int j,i,k;
    i=strlen(s1);
    j=strlen(s2);
    k=strcmp(s1,s2);

    printf("\ncoping %s into %s ",s1, s2);
    strcpy(s2,s1);
    printf("%s\n",s2);
   printf("\nComparing %s  with %s is %d\n",s1,s2,k);
      if(j+i<50)
    {
    printf("\nappending %s into %s",s1,s2);
    strcat(s1,s2);
    printf(" %s\n",s1);

    }

    printf("\nThe lenght of s1 is : %d\n",i);
}
