#include <stdio.h>
int main()
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

    }
}
