 #include <stdio.h>
int main()
{
    int i,j,k;
    i=1;
    while(i<=4)
    {

        j=2;
        while(j<=i)
        {
        printf(" ");
        j++;
        }
        k=7;
        while(k>=(2*i-1))
        {
            printf("*");
            k--;
        }
        i++;
        printf("\n");
    }
}
