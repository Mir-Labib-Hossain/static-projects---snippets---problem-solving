//Problem link : - https://www.hackerrank.com/contests/tablenozero/challenges/repair-three-numbers
package uoda_contest;
import java.util.Scanner;
public class Repair_threee_numbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long arr[] = new long[4];
        arr[0] = sc.nextLong();
        arr[1] = sc.nextLong();
        arr[2] = sc.nextLong();
        arr[3] = sc.nextLong();
        
        long t=0;
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(arr[i]<arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        String s ="";
        a:
        for(int i=1; i<arr[3]; i++)
        {  
            for(int j=1; j<arr[3]; j++)
            {
                for(int k=1; k<arr[3]; k++)
                {   
                    if(i+j+k==arr[3] && i+j==arr[2] && k+j == arr[0] && i+k==arr[1])
                    {
                        s+=i+" "+j+" "+k;
                        break a;
                    }
                }
            }
        }  
        System.out.println(s);
    }
}