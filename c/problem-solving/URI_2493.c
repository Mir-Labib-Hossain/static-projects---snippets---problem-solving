#include <stdio.h>
#include<string.h>

int main()
{
    int i, n;
    while(scanf("%d",&n)!=EOF)
    {
        int n1[n], n2[n], eq[n];
        char name[n][1000], op[n];
        int index[n], num;
        char *ans[n], temp[n];
        int check = 0, j=0, k=0;
        for(i=0; i<n; i++)
        {
            scanf("%d %d=%d",&n1[i],&n2[i],&eq[i]);
        }
        for(i=0; i<n; i++)
        {
            scanf("%s %d %c",&name[i],&index[i],&op[i]);
            num = index[i] - 1;
            if(  (op[i]=='+' && (n1[num]+n2[num]!=eq[num])) ||
                 (op[i]=='-' && (n1[num]-n2[num]!=eq[num])) ||
                 (op[i]=='*' && (n1[num]*n2[num]!=eq[num])) ||
                 ((op[i]=='I') && ((n1[num]+n2[num]==eq[num]) ||
                                   (n1[num]-n2[num]==eq[num]) ||
                                   (n1[num]*n2[num]==eq[num]) )) )
            {
                ans[k]=name[i];
                check++;
                k++;
            }
        }
        if(check==n)
            printf("None Shall Pass!\n");
        else if(check==0)
            printf("You Shall All Pass!\n");
        else
        {
            for ( i = 0; i < k; ++i)
            {
                for ( j = i + 1; j < k; ++j)
                {
                    if (strcmp(ans[i], ans[j]) > 0)
                    {
                        strcpy(temp, ans[i]);
                        strcpy(ans[i], ans[j]);
                        strcpy(ans[j], temp);
                    }
                }
            }
            for ( i = 0; i < k; ++i)
            {
                printf("%s",ans[i]);
                if(i!=k-1)
                    printf(" ");
            }
            printf("\n");
        }
    }
    return 0;
}
