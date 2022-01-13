package bank;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner monaim = new Scanner(System.in);
        int acount1 = 120022;
        int money = 2000;
        System.out.println("Enter Bank id : ");
        int id = monaim.nextInt();
        if(id == acount1)
        {
            System.out.println("Enter method :\n1 for Withdraw\n2 for Deposit\n3 for Exit :");
            int choice = monaim.nextInt();
            if(choice == 1)
            {
                System.out.println("Current ammount is "+money+"\nEnter the amount you want to withdraw :");
                int withdraw = monaim.nextInt();
                money = money-withdraw;
            }
            else if(choice == 2)
            {
                System.out.println("Current ammount is "+money+"\nEnter the amount you want to deposit :");
                int deposit = monaim.nextInt();
                money=money+deposit;
            }
            else if(choice == 3)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Wrong input");
            }
            System.out.println("Current ammount in account : "+money);
        }
        else
        {
            System.out.println("Wrong Id");
        }
    }
    
}
