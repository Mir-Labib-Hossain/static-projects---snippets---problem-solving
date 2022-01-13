#include <stdio.h>
int main(){
int a[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,83,89,97};
int l = sizeof(a)/sizeof(int);
int n;
printf("Enter a number : ");
scanf("%d",&n);
int i,f=1;
for(i=1; i<n; i++)
{
f=f*i;
}


while(f!=1)
{

for(i=0; i<l; i++)
{

if(f%a[i]==0)
{

    f=f/a[i];
    //printf("%d ",a[i]);
    while(f==1)
{
    printf("%d ",a[i]);
}
}
}
}
}
