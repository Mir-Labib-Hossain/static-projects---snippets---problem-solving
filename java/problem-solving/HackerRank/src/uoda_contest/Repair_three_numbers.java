package uoda_contest;
import java.util.Scanner;
public class Repair_three_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        String s = "";
        int i=0, j=0;
        int count = 0;
        if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3])
            System.out.println(arr[i]+" 0 0");
        else
        {
            for(i=0; i<4; i++)
            {
                for(j=0; j<4; j++)
                {
                    if(i!=j && (arr[i]-arr[j])>=0)
                    {
                       s+=(arr[i]-arr[j])+" ";
                       count++;
                    }
                }
            }
            System.out.println(count);
            System.out.println(s);
            String srr[] = s.split(" ");
            for(i=0; i<srr.length; i++)
            {
                for(j=0; j<srr.length; j++)
                {
                    if(i!=j && srr[i].equals(srr[j]))
                    srr[j]="0";
                }
            }
            for(i=0; i<srr.length; i++)
            {
                if(!srr[i].equals("0"))
                    System.out.print(srr[i]);
            }
        }
    }
}