package Challenges;
import java.util.*;
import java.io.*;
class JavaLoop2{
    public static void main(String []argh){
         Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        int a;
        int b;
        int n;
        int ans=0;
        for(int i=0; i<test; i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            for(int j=0; j<n; j++)
            {
                for(int k=0; k<=j; k++)
                {
                    ans+=Math.pow(2, k)*b;
                }
                System.out.print(ans+a);
                if(j<n-1)
                    System.out.print(" ");
                ans=0;
            }
            System.out.println();
        }
    }
}