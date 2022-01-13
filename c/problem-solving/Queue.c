#include <stdio.h>
int main()
{
    int array[5],i,j,rear,front,c1,item;
    printf("Press 1 to Insert in the Queue\nPress 2 to Delete from the Queue\n");
    scanf("%d",&c1);
    if(c1==2)
    {
        printf("Queue UnderfFlow\n\n");
    }
    else if(c1==1)
    {
        for(i=0; i<=5; i++)
        {
            if(i==5)
            {
                printf("Queue OverFlow\n\n");
            }
            else
            {
                printf("Press 0 to stop Insertion, OR\nEnter %d Element : ",i);
                scanf("%d",&item);
                if(item==0)
                {
                    break;
                }
                else
                {
                    array[i]=item;
                }
            }
        }
        printf("Do you want to Insert more? Front (1st Element)will be deleted ? ");
        {
            for(i=1; i<=i+1; i++)
            {
                printf("Press 0 to stop\nOr the number you want to insert :");
                scanf("%d",&item);
                if(item ==0)
                {
                    break;
                }
                for(j=0; j<4; j++)
                {
                    array[j]=array[j+1];
                }
                array[4]=item;
            }
        }
    }

    else
    {
        printf("Eror");
    }
    printf("final Queue :");
    for(j=1; j<=5; j++)
    {
        printf("%d\t",array[j]);
    }
}
