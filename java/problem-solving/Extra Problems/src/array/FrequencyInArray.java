package array;
import java.util.Scanner;
public class FrequencyInArray {
    public static void main(String[] args) {
Scanner labib = new Scanner (System.in);
        System.out.println("Select a method to enter numbers : \nPress 1 for String \nPress 2 for Array");
        int m = labib.nextInt();
        int count =0;
        if(m==1)
        {
            labib.nextLine();
            System.out.print("\nEnter inteager String :");
            String s = labib.nextLine();
            int l = s.length();
            for(int i =0; i<l; i++)
            {
                for(int j=0; j<l; j++)
                {
                if((s.charAt(i)-48)==(s.charAt(j)-48))
                {
                    count++;
                }
                }
                System.out.println("The frequency of "+(s.charAt(i)-48)+" is "+count);
                count =0;
            }  
        }
        else if(m==2)
        {
            System.out.print("\nEter the size of Array :");
            int l = labib.nextInt();
            int arr[] = new int[l];
            for(int i=0; i<l; i++)
            {
            System.out.print("\nEnter Element for "+i+" index :");
            arr[i] = labib.nextInt();
            }
            for(int i=0; i<l; i++)
            {
                for(int j=0; j<l; j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count ++;
                    }
                }
                System.out.println("The frequency of "+arr[i]+" is "+count);
                count =0;
            }
        }
        else if(m!=1 && m!=2)
        {
            System.out.println("Wrong Number !");
        }
        
    }
    
}
