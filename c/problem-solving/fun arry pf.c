#include <stdio.h>
int main()
{
    char c;
    printf("Menu:\nPress P : Prime\nPress F : Fibonuccie\n-");
    scanf("%c", &c);
    if(c=='F')
    {
        int i, n1=0, n2=1, n3=0, choice=0;
        printf ( "Enter a number" );
        scanf ( "%d", &choice );
        for ( i=0; i<=choice; i++ )
        {
            n1=n2;
            n2=n3;
            n3 = n1+n2;
            if( choice == n3)
            {
                printf("%d is fibo",choice);
                return 0;
            }
            else
            {
                printf("%d is not fibo number",choice);
                return 0;
            }

        }
    }
    else if(c=='P')
    {
        int z,j,check=0;
        printf("Enter a number :");
        scanf("%d",&z);
        for(j=2; j<=z/j; j++)
        {
            if(z%j==0)
            {
                check=1;
            }
        }
        if(z==1)
        {
            printf("%d is not prime",z);
            return 0;
        }
        else
        {
            if(check == 0)
            {
                printf("%d is prime",z);
                return 0;
            }
            else
            {
                printf("%d is not prime",z);
            }

        }

    }
    else
    {
        printf("Wrong key input");
    }
}
