#include<stdio.h>
int main(){
int x,a,b,i,j,k;
scanf("\n %d",&b);
scanf("\n %d",&a);
if(a<b){
    x=a;
}
else{
    x=b;
}
for(;x>=1;x--){
    if(a%x==0&&b%x==0){
        j=x;
        break;
    }
    }
    printf("%d",j);
}
