#include<stdio.h>
int main()
{
    int n;
    while(scanf("%d",&n)!=EOF)
    {
        if(n<90 || n==360)
            printf("Bom Dia!!\n");
        else if(n>=90 && n<180)
            printf("Boa Tarde!!\n");
        else if(n>=180 && n<270)
            printf("Boa Noite!!\n");
        else
            printf("De Madrugada!!\n");
    }
    return 0;
}
