#include <stdio.h>
int main()
{
    float a,b,c,d,f,e,g;
    scanf("%f %f %f %f",&a,&b,&c,&d);
    f=(a+b+c+d)/4;
    printf("Media: %0.1f \n",f);
    if(f>=7)
    {
        printf("Aluno aprovado \n");
    }
    else if(f<5)
    {
        printf("Aluno reprovado \n");
    }
    else
    {
        printf("Aluno em exame \n");
        scanf("%f",&e);
    printf("Nota do exame : %0.1f \n",e);
    g=(f+e)/2;
    if(g>=5)
    {
        printf("Aluno aprovado \n");
    }
    else
    {
        printf("Aluno reprovado \n");
    }
    printf("Media final: %0.1f",g);
    }

}
