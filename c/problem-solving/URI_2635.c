#include <stdio.h>
#include <stdbool.h>

bool startsWith(const char *pre, const char *str)
{
    return strncmp(pre, str, strlen(pre)) == 0;
}
int main()
{
    int i, j, n, q, temp;
    scanf("%d",&n);
    char sug[n][101];
    for(i=0; i<n; i++)
    {
        scanf("%s",sug[i]);
    }
    scanf("%d",&q);
    char inp[q][101];
    int count[q];
    int len[q];
    for(i=0; i<q; i++)
    {
        scanf("%s",inp[i]);
        temp=0;
        count[i]=0;
        for(j=0; j<n; j++)
        {
            if(startsWith(inp[i],sug[j])==1)
            {
                count[i]++;
                if(temp<strlen(sug[j]))
                    temp=strlen(sug[j]);
            }
        }
        len[i]=temp;
    }
    for (i = 0; i < q; i++)
    {
        if (count[i] == 0)
        {
            printf("-1\n");
        }
        else
        {
            printf("%d %d\n",count[i], len[i]);
        }
    }
    return 0;
}
