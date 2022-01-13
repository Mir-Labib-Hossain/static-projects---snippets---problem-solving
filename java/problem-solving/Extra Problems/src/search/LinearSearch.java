package search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter mathod to enter numbers:");
        System.out.println("Press 1 for - Sting");
        System.out.println("Press 2 for - Array");
        int a = obj.nextInt();
        int d=0,f=0,i=0,count =0;;
        if(a == 1)
        {
            obj.nextLine();
            
            System.out.println("Enter a number : ");
            String num = obj.nextLine();

            System.out.println("Enter the number you wanna seen index of :");
            d = obj.nextInt();         
            
            int l = num.length();
            for( i = 0; i < l; i++ ){
                f = (num.charAt(i) - 48);
                if( d == f ){
                    count = 1;
                    break;
                }
            }
        }
        else if(a == 2)
        {
            System.out.println("Enter how many elements there will :");
            int len = obj.nextInt();
            
            int []arr = new int[len];
            
            System.out.println("Enter " + len + "elements");
            for(i = 0; i < len; i++){
                arr[i] = obj.nextInt();
            }
            
            System.out.println("Enter the number you wanna seen index of :");
            d = obj.nextInt();
            
            for(i = 0; i < len; i++){
                if(arr[i] == d){
                    count = 1;
                    break;
                }
            }
        }
        if(count == 1){
            System.out.println("Index of " + d + " is " + i);
        }
        else{
            System.out.println("Not in the Array");
        }
    }
}
