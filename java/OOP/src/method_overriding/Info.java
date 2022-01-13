package method_overriding;
import java.util.Scanner;
public class Info {
public static void main(String[] args)
    {
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter the Name of Laptop :");
        String ln     = obj.nextLine();
        System.out.print("Enter the Generation of Laptop :");
        String lg     = obj.nextLine();
        System.out.print("Enter the Cores of Laptop :");
        int    lc     = obj.nextInt();
        System.out.print("Enter the Rams of Laptop :");
        int    lr     = obj.nextInt();
        
        Laptop l1     = new Laptop();
        l1.Name       = ln;
        l1.Core       = lc;
        l1.Ram        = lr;
        l1.Generation = lg;
        l1.ShowInfo();
        
        Mobile m1     = new Mobile();
        m1.Name       = "Xiaomi";
        m1.Ram        = 4;
        m1.FrontCamera= 12;
        m1.BackCamera = 24;
        m1.ShowInfo();
    }
    
}
