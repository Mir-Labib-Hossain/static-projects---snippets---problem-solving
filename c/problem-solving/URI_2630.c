#include <stdio.h>

int main()
{
    int n,i,j,k,tmp,r,g,b;
    char s[10];
    scanf("%d",&n);
    for (i = 0; i < n; i++)
    {
        scanf("%s",s);
        scanf("%d %d %d",&r,&g,&b);
        printf("Caso #%d: ",(i + 1));
        if (s[1]=='y')
        {
            printf("%d\n",(int)((r * 0.30) + (g * 0.59) + (b* 0.11)));
        }
        else if (s[1]=='e')
        {
            printf("%d\n",((r + g + b) / 3));
        }
        else
        {
            if(s[1]=='i')
            {
                if(r<=g && r<=b) tmp=r;
                else if(b<=g && b<=r) tmp=b;
                else if(g<=r && g<=b) tmp=g;
                printf("%d\n",tmp);
            }
            else if (s[1]=='a')
            {
                if(r>g && r>b) tmp=r;
                else if(b>g && b>r) tmp=b;
                else if(g>r && g>b) tmp=g;
                printf("%d\n",tmp);
            }
        }
    }
    return 0;
}
