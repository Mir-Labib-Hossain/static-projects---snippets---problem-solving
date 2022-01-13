#include <stdio.h>
int main(){
    int X=0;
    int i=0;
while(1){
    scanf("%d",&X);
    if(X==0)
        break;
    else{
        printf("1");
        for(i=2; i<=X; i++)
            printf(" %d",i);
        printf("\n");
    }
}
}
