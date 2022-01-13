#include <stdio.h>
int main()
{
    int chicken1, chicken2, beef1, beef2, pasta1, pasta2, ans=0;
    scanf("%d %d %d",&chicken1,&beef1,&pasta1);
    scanf("%d %d %d",&chicken2,&beef2,&pasta2);

    ans += (chicken2 > chicken1) ? (chicken2 - chicken1) : 0;
    ans += (beef2 > beef1) ? (beef2 - beef1) : 0;
    ans += (pasta2 > pasta1) ? (pasta2 - pasta1) : 0;

    printf("%d\n",ans);
    return 0;
}
