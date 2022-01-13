
int main()
{
    int a,b,c,d;
    float v;
    char x;
    printf("enter your choice A,B,C");
    x=getch();
   if (x == 'a' || x == 'A')
    {
        printf("enter 4 number");
        scanf("%d%d%d%d",&a,&b,&c,&d);
        v=(a+b+c+d)/4;
        printf("the average =%f",v);
    }

    else if(x== 'b')

    {




        printf("enter 4 number");
        scanf("%d%d%d%d",&a,&b,&c,&d);

                 if ( a>b && a>c && a>d)
        {
        printf("a is greater");
        }
        else if ( b>a && b>c && b>d)
        {
        printf("b is greater");
        }
        else if ( c>a && c>b && c>d)
        {
        printf("c is greater");
        }
        else
        {
        printf("d is greater");
        }
    }
   else if(x== 'c')
   {
      printf("enter 4 number");
        scanf("%d%d%d%d",&a,&b,&c,&d);
        v=(a+b+c+d);
        scanf("%f is addition",v);
   }
   else
   {
       printf("\n error");
   }
   return 0;
}

