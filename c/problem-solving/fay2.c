#include <stdio.h>
int main()
{
int a,b,c;
scanf("%d %d %d",&a,&b,&c);
if(a<b && a<c && b<c)
{
    printf("%d \n%d \n%d \n",a,b,c);
}
else if(b<c && b<a && c<a)
{
    printf("%d \n%d \n%d \n",b,c,a);
}
else if(b<c && b<a && a<c)
{
    printf("%d \n%d \n%d \n",b,a,c);
}
else if(c<a && c<b && b<a)
{
    printf("%d \n%d \n%d \n",c,b,a);
}
else
{
    printf("%d \n%d \n%d \n",c,a,b);
}
}
