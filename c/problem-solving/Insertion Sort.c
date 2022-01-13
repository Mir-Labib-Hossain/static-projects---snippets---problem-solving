#include <stdio.h>
#include <math.h>
int main()
{
    int ptr, temp, array[8] = {88,33,44,11,88,22,66,55}, i;
    double in = -INFINITY;
    array [ 0 ] = in;
    for ( i = 1; i <= 8; i++ )
    {
        temp = array [ i ];
        ptr = i - 1;
        while ( temp < array [ ptr ] )
        {
            array [ ptr + 1 ] = array [ ptr ];
            ptr = ptr - 1 ;
        }
        array [ ptr + 1 ] = temp;
    }
    for ( i = 1; i <= 8; i++ )
    {
        printf ( "%d ",array[i] );
    }
        return 0;
}
