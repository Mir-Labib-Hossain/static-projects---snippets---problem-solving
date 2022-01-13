#include <stdio.h>
int main()
{
    int n,k;
    int i, j, x, count = 0;
    scanf("%d",&n);
    scanf("%d",&k);
    int arr[n];
    for (i = 0; i < n; i++)
        scanf("%d",&arr[i]);
    for (i = 0; i < n; ++i)
    {
        for (j = i + 1; j < n; ++j)
        {
            if (arr[i] > arr[j])
            {
                x =  arr[i];
                arr[i] = arr[j];
                arr[j] = x;
            }
        }
    }
    x = n - 1;
    while (1==1)
    {
        for (i = 0; i < n; i++)
        {
            if (arr[x] == arr[x - i])
            {
                count++;
            }
            else
            {
                break;
            }
        }
        if (count >= k)
        {
            break;
        }
        x = x - i;
    }
    printf("%d\n",count);
    return 0;
}
