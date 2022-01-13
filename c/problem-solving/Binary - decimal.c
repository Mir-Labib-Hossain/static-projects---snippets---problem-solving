#include <stdio.h>
#include<math.h>
int main()
{
    int i=0,d;
    char a[10];
    int sum=0;
    printf("Enter Binary Number : ");
    scanf("%s",&a);

    int l = strlen(a);
    int power = l-1;
    for(i = 0; i<l; i++)
    {
        d=(int)a[i];
        d=d-48;
        sum=sum+d*pow(2,power);
        power--;
    }
    printf("Decimal Number  : %d",sum);
}

