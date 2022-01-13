package Polymorphism;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner l= new Scanner(System.in);
        System.out.println("Enter 1st value :");
        int a = l.nextInt();
        System.out.println("Enter 2nd value :");
        int b = l.nextInt();

        System.out.println("Enter A for Addition\nEnter S for Subtractin\nEnter M for Multiplication\nEnter D for Divission\nEnter Z for All");
        char c = l.next().charAt(0);
        base[] x = new base[5];

        x[0]=new base();
        x[1]=new add(a,b);
        x[2]=new sub(a,b);  
        x[3]=new mul(a,b);
        x[4]=new div(a,b);           

        if(c=='A' || c=='a')
        {
x[1].result();
        }
        else if(c=='s'||c=='S')
        {
            x[2].result();
        }
        else if(c=='m'||c=='M')
        {
            x[3].result();
        }
        else if(c=='D'||c=='d')   
        {
             x[4].result();
        }
        else if(c=='z' ||c== 'Z')
        {
            for (int i =1; i<5; i++)
            {
            x[i].result();
            }
        }
    }
}
    

