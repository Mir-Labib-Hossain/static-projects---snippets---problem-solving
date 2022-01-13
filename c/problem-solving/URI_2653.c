#include <stdio.h>
int main()
{
    int n=0,i,j,c=0;
    char temp[100000];
    char s;
    while(scanf("%s%*c", &s)!=EOF)
    {
        if(n==0)
            strcpy(temp, s);
        else
            strcat(temp, " "+s);

        n++;
    }
    char * arr = strtok(temp, " ");
    printf("%d",n);


    printf("%s",temp);
    for(i=0; i<n; i++)
    {
        for(j=0; j<n; j++)
        {
            if(i!=j && arr[i]==arr[j])
            {
                c++;
            }
        }
    }
    printf("%d\n",c);
    return 0;
}
