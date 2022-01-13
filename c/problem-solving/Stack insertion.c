#include <stdio.h>
int main()
{
    int a[5], top, i = 0, item = 0, c1, c2, c3, tem;
    printf ("Press 1 to PUSH\nPress 2 to POP\n " );         //1st Choice
    scanf ( " %d ", &c1 );
    if ( c1 == 1 )
    {
        for ( i = 1; i <= 6; i++ )
        {
            if ( i == 6 )
            {
                printf ( "\nStack OvarFlow\nNo more insertion avialable.\n " );          //if array is filled
                break;
            }
            else
            {
                printf( "\nPress 0 (ZERO) to stop insertion. OR\nEnter a value to PUSH : " );
                scanf( " %d ", &item );
                if ( item == 0 )
                {
                    break;
                }
                else
                {
                    a[i] = item;
                    top = i;
                    item++;
                }
            }
        }
    }
    else if ( c1 == 2 )
    {
        printf ( "Stack UnderFlow\n" );
        return 0;
    }
    else
    {
        printf ( "EROR" );
        return 0;
    }
    printf ( "\nDo you want to POP?\nPress 1 to POP\nOR\nPress any key to Exit\n" );
    scanf ( "%d", &c2 );           //2nd choice, POP the inserted value or exit to answer
    if(c2==1)
    {
start:
        for(i = top; i >= 0; i-- )
        {
            if ( item == 0 && i == 0 )
            {
                printf ( "Stack UnderFlow\n" );     //if 1st choice is POP because no element inserted
                break;
            }
            tem = a[i];
            a[i] = 0;
            printf ( "\nPOPED %d \nDo you want to POP more ?\nIf NO Press 0 (ZERO) \n", tem );
            scanf ("%d", &c3 ); //3rd choice if user want to POP mote then one or want to exit
            if ( c3 == 0 )
            {
                break;
            }
        }
    }
    printf ( "\nSTACK PUSH & POP ENDED !\nOutput Array is :" );   //PUSH & POP done
    for ( i = 1; i <= top; i++ )
    {
        printf ( "%d\t", a[i] );   //printing the element we have after PUSH & POP
    }
}
