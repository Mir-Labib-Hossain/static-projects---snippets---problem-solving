#include <stdio.h>

int main()
{
    int i,j,n,m;
    while(scanf("%d %d",&n,&m)!=EOF)
    {
        int a[n][m];
        int b[n][m];
        int x =n*m;
        char s[10000] = {0};
        x=0;
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {
                scanf("%d",&a[i][j]);
            }
        }
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < m; j++)
            {
                if (a[i][j] == 1)
                {
                    b[i][j] = 9;
                }
                else
                {
                    b[i][j] = 0;

                    if (i != 0 && a[i - 1][j] == 1)
                    {
                        b[i][j]++;
                    }
                    if (j != m - 1 && a[i][j + 1] == 1)
                    {
                        b[i][j]++;
                    }
                    if (i != n - 1 && a[i + 1][j] == 1)
                    {
                        b[i][j]++;
                    }
                    if (j != 0 && a[i][j - 1] == 1)
                    {
                        b[i][j]++;
                    }
                }
                x += sprintf (&s[x], "%d", b[i][j]);
            }
            x += sprintf (&s[x], "\n");
        }
        printf("%s", s);
    }
    return 0;
}
