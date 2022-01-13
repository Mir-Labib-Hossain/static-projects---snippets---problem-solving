#include <stdio.h>
int main()
{

    double N1, N2, N3, N4;
    double N5, av1, av2;
    scanf("%lf %lf %lf %lf", &N1, &N2, &N3, &N4);
    av1=(N1*2+N2*3+N3*4+N4)/10;
    printf("Media: %.1lf\n",av1);
    if(av1>=7.0)
    {
        printf("Aluno aprovado.\n");
        return 0;
    }
    else if(av1<=4.9)
    {
        printf("Aluno reprovado.\n");
        return 0;
    }
    else
    {   printf("Aluno em exame.\n");
        scanf("%lf",&N5);
        printf("Nota do exame: %.1lf\n",N5);
        av2=(av1+N5)/2;
        if(av2>=5.0)
        {
            printf("Aluno aprovado.\n");
        }
        else
        {
            printf("Aluno reprovado.\n");
        }
        printf("Media final: %.1lf\n",av2);
    }

}
