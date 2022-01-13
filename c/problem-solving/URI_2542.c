#include <stdio.h>
int main()
{
    int n, md, ld, i, j, mc, lc, nc; //c = chosen
    while(scanf("%d",&n)!=EOF)
    {
        scanf("%d %d",&md,&ld);
        int ma[n][md];
        int la[n][ld];
        for(i=0; i<md; i++)
        {
            for(j=0; j<n; j++)
            {
                scanf("%d",&ma[j][i]);
            }
        }
        for(i=0; i<ld; i++)
        {
            for(j=0; j<n; j++)
            {
                scanf("%d",&la[j][i]);
            }
        }
        scanf("%d %d",&mc, &lc);
        scanf("%d",&nc);
        if(ma[nc-1][mc-1] == la[nc-1][lc-1])
        {
            printf("Empate\n");
        }
        else if(ma[nc-1][mc-1] > la[nc-1][lc-1])
        {
            printf("Marcos\n");
        }
        else
        {
            printf("Leonardo\n");
        }
    }
    return 0;
}
