package bouble_sort2;
public class Sort {
    void getarr(int a[],int l)
   {
       int t=0;
       for(int i=0; i<l; i++)
       {
           for(int j=0; j<l-1; j++)
           {
               if(a[j]>a[j+1])
               {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
               }
           }
       }
       for(int i=0; i<l; i++)
       {
           System.out.print(a[i]+" ");
       }
   }
}
