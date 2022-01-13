#include <stdio.h>
int main()
{
    int j, i, p=0, c;
    float sum=0;
    for(j=1; j<=100; j++)
    {
        c=0;
        for(i=2; i<=j/2; i++)
        {
            if(j%i==0)
            {
                c=1;
                break;
            }
        }
        if(c==0 && j!=1)
        {
            sum+=j;
            p++;
        }
    }
    printf("Mir Labib Hossain (011183007)\nPrime = %d\nAverage = %.3f\n",p,(sum/p));
    return 0;
}

Mir Labib Hossain (011183007)
Prime = 25
Average = 42.400
//
//int i,f=1,n=13;
//    for(i=2; i<=n/2; i++)
//    {
//        if(n%i==0){
//            f = 0;
//            break;
//        }
//    }
//    if(f==1)
//        printf("%d Prime\n",n);
//    else
//        printf("%d Non-Prime\n",n);
//    return 0;














// int i,j,f,n=10;
//    for(j=2; j<=n; j++)
//    {
//        f=1;
//        for(i=2; i<=j/2; i++)
//        {
//            if(j%i==0)
//                {f = 0;
//                break;
//                }
//        }
//        if(f==1)
//            printf("%d Prime\n",j);
//        else
//            printf("%d Non-Prime\n",j);
//    }
//    return 0;
