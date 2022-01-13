package uoda_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class I_missing_you {
       public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String srr[] = s.split(" ");
        int n = Integer.parseInt(srr[0]);
        int m = Integer.parseInt(srr[1]);
        int k = Integer.parseInt(srr[2]);
        int arr[] = new  int[n];
        s = br.readLine();
        String srr2[] = s.split(" ");
        int count = 0;
        for(int i=m; i<n; i++)
        {
            count+=10;
            if(Integer.parseInt(srr2[i])<=k && Integer.parseInt(srr2[i])!=0)
            break;
        }
        int count2=0;
        for(int i=m-2; i>=0; i--)
        {
            count2+=10;
            if(Integer.parseInt(srr2[i])<=k && Integer.parseInt(srr2[i])!=0)
            break;
        }
        if(count<count2 || count2==0)
           System.out.println(count);
        else
            System.out.println(count2);
           System.out.println("");
           System.out.println(count+"  "+count2);
    }
}