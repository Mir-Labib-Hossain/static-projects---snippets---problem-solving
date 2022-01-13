#include <stdio.h>
int main()
{

      char name[100]="habib hossain";
    int len, i, n, u=0, l=0, s=0, o=0;
    FILE *fp;
    len=strlen(name);
    fp = fopen("uplow.txt","a");
//    fp = fopen("uplow.txt","r");
    for(i=0; i<len; i++)

    {
        fscanf(fp,"%c", name[i]);
    }


//    for(i=0; i<len; i++)
//    {
//        if(name[i]>='a' && name[i]<='z')
//        {
//            l++;
//        }
//        else if(name[i]>='A' && name[i]<='Z')
//        {
//            u++;
//        }
//        else if(name[i]==' ' )
//        {
//            s++;
//        }
//        else
//        {
//            o++;
//        }
//    }
//    printf("Total upper number %d\nTotal lower number %d\nTotal space %d\nTotal others %d",u,l,s,o);
}

