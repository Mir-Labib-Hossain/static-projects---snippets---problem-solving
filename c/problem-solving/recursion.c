#include <stdio.h>
int main()
{
int a;
printf ( "Enter a number : " );
scanf  ( "%d", &a );
printf ( "fact of %d is %d", a, fac (a) );
}
int fac ( int a )
{
if ( a == 1 )
{
return 1;
}
else
{
return a*fac(a-1);
}
}
